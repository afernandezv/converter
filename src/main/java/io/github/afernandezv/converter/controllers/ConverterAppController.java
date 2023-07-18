package io.github.afernandezv.converter.controllers;

import io.github.afernandezv.converter.enums.*;
import io.github.afernandezv.converter.utils.CurrencyConverter;
import io.github.afernandezv.converter.utils.UnitConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ResourceBundle;

public class ConverterAppController<T> implements Initializable {
    @FXML
    private Pane welcomePane;
    // Menu Icons
    @FXML
    private Button currencyButton;

    @FXML
    private Button lengthButton;

    @FXML
    private Button massButton;

    @FXML
    private Button temperatureButton;

    // Controls
    @FXML
    private TextField valueText;

    @FXML
    private ChoiceBox<T> fromSelect;

    @FXML
    private ChoiceBox<T> toSelect;

    @FXML
    private Button convertButton;

    @FXML
    private Label headerText;

    @FXML
    private Label resultText;

    private Category category;

    private DecimalFormat decimalFormat;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(4);
        restrictDecimalNumbers();

        currencyButton.setOnAction(actionEvent -> {
            category = Category.CURRENCY;
            initControls();
        });

        lengthButton.setOnAction(actionEvent -> {
            category = Category.LENGTH;
            initControls();
        });

        massButton.setOnAction(actionEvent -> {
            category = Category.MASS;
            initControls();
        });

        temperatureButton.setOnAction(actionEvent -> {
            category = Category.TEMPERATURE;
            initControls();
        });

        convertButton.setOnAction(actionEvent -> convert());
    }

    private void initControls(){
        hideWelcomePane();
        setHeaderText();
        populateChoiceBox();
    }

    private void setHeaderText(){
        headerText.setText("Conversor de " + this.category.getDescription());
    }

    private void populateChoiceBox(){
        List<T> itemsList = switch (this.category.name()) {
            case "CURRENCY" -> CurrencyType.getTypes();
            case "LENGTH" -> LengthUnit.getUnits();
            case "MASS" -> MassUnit.getUnits();
            default -> TemperatureUnit.getUnits();
        };
        ObservableList<T> items = FXCollections.observableList(itemsList);
        fromSelect.setItems(items);
        toSelect.setItems(items);
        fromSelect.getSelectionModel().selectFirst();
        toSelect.getSelectionModel().select(1);
    }

    public void restrictDecimalNumbers(){
        this.valueText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("-?([0-9]*)?(\\.[0-9]*)?")){
                valueText.setText(oldValue);
            }
        });
    }

    private void hideWelcomePane(){
        if(this.welcomePane.isVisible()){
            this.welcomePane.setVisible(false);
        }
    }

    private boolean unitsAreEquals(String from, String to){
        return from.equals(to);
    }

    private void convert(){
        try {
            double value = Double.parseDouble(valueText.getText());
            String from = null;
            String to = null;
            double convertedValue;
            switch (category.name()) {
                case "CURRENCY" -> {
                    from = ((CurrencyType) fromSelect.getSelectionModel().getSelectedItem()).name();
                    to = ((CurrencyType) toSelect.getSelectionModel().getSelectedItem()).name();
                    convertedValue = (unitsAreEquals(from, to)) ? value : CurrencyConverter.convertCurrency(value, from, to);
                    resultText.setText(decimalFormat.format(value) + " " + from + " = " + decimalFormat.format(convertedValue) + " " + to);
                    return;
                }
                case "LENGTH" -> {
                    from = ((LengthUnit) fromSelect.getSelectionModel().getSelectedItem()).getSymbol();
                    to = ((LengthUnit) toSelect.getSelectionModel().getSelectedItem()).getSymbol();
                }
                case "MASS" -> {
                    from = ((MassUnit) fromSelect.getSelectionModel().getSelectedItem()).getSymbol();
                    to = ((MassUnit) toSelect.getSelectionModel().getSelectedItem()).getSymbol();
                }
                case "TEMPERATURE" -> {
                    from = ((TemperatureUnit) fromSelect.getSelectionModel().getSelectedItem()).getSymbol();
                    to = ((TemperatureUnit) toSelect.getSelectionModel().getSelectedItem()).getSymbol();
                }
                default -> System.out.println("Conversion de " + category.name() + " no implementada");
            }
            assert from != null;
            convertedValue = (unitsAreEquals(from, to)) ? value : UnitConverter.convertUnit(category.name().toLowerCase(), value, from, to);
            resultText.setText(decimalFormat.format(value) + " " + from + " = " + decimalFormat.format(convertedValue) + " " + to);
        } catch (NumberFormatException e) {
            resultText.setText("Introduce un valor válido");
        }
    }
}
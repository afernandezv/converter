package io.github.afernandezv.converter.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.kordamp.ikonli.javafx.Icon;

import java.net.URL;
import java.util.ResourceBundle;

public class ConverterAppController<T> implements Initializable {
    // Menu Icons
    @FXML
    private Icon currencyButton;

    @FXML
    private Icon lengthButton;

    @FXML
    private Icon massButton;

    @FXML
    private Icon temperatureButton;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
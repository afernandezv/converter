package io.github.afernandezv.converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ConverterApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.setProperty("prism.lcdtext", "false");
        FXMLLoader fxmlLoader = new FXMLLoader(ConverterApp.class.getResource("views/ConverterAppView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 500);
        stage.setTitle("Conversor de divisas y unidades");
        stage.setResizable(false);
        stage.getIcons().add(new Image(Objects.requireNonNull(ConverterApp.class.getResourceAsStream("icons/appIcon.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package io.github.afernandezv.converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ConversorApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ConversorApp.class.getResource("views/ConversorAppView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 500);
        stage.setTitle("Currency & Unit Converter");
        stage.setResizable(false);
        stage.getIcons().add(new Image(Objects.requireNonNull(ConversorApp.class.getResourceAsStream("icons/appIcon.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
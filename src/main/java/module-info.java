module io.github.afernandezv.converter {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;
    requires org.kordamp.ikonli.materialdesign2;


    opens io.github.afernandezv.converter to javafx.fxml;
    exports io.github.afernandezv.converter;
    exports io.github.afernandezv.converter.controllers;
    opens io.github.afernandezv.converter.controllers to javafx.fxml;
    opens io.github.afernandezv.converter.pojo.currencyconversion to com.google.gson;
    opens io.github.afernandezv.converter.pojo.unitconversion to com.google.gson;
}
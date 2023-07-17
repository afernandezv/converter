module io.github.afernandezv.converter {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.afernandezv.converter to javafx.fxml;
    exports io.github.afernandezv.converter;
    exports io.github.afernandezv.converter.controllers;
    opens io.github.afernandezv.converter.controllers to javafx.fxml;
}
module threaduri.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens threaduri.demo to javafx.fxml;
    exports threaduri.demo;
}
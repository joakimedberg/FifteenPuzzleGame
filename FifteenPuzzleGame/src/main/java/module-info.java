module nackademin {
    requires javafx.controls;
    requires javafx.fxml;

    opens nackademin to javafx.fxml;
    exports nackademin;
}
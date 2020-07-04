module com.ajs.deposity.view {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ajs.deposity.view to javafx.fxml;
    exports com.ajs.deposity.view;
}
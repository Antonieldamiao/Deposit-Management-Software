module com.ajs.deposity.view {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires com.jfoenix;
    requires lombok;
    requires java.sql;

    opens com.ajs.deposity.view to javafx.fxml;
    opens com.ajs.deposity.view.controllers.clients to javafx.fxml;
    opens com.ajs.deposity.view.controllers.home to javafx.fxml;
    opens com.ajs.deposity.view.controllers.products to javafx.fxml;
    opens com.ajs.deposity.view.controllers.reports to javafx.fxml;
    opens com.ajs.deposity.view.controllers.login to javafx.fxml;
    opens com.ajs.deposity.view.controllers.birthdays to javafx.fxml;
    opens com.ajs.deposity.view.controllers.sales to javafx.fxml;
    opens com.ajs.deposity.view.controllers.menu to javafx.fxml;

    exports com.ajs.deposity.view;
    exports com.ajs.deposity.view.controllers.clients;
    exports com.ajs.deposity.view.controllers.home;
    exports com.ajs.deposity.view.controllers.products;
    exports com.ajs.deposity.view.controllers.birthdays;
    exports com.ajs.deposity.view.controllers.login;
    exports com.ajs.deposity.view.controllers.menu;
    exports com.ajs.deposity.view.controllers.reports;
    exports com.ajs.deposity.view.controllers.sales;

}
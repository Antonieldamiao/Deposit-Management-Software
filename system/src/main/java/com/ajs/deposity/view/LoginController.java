package com.ajs.deposity.view;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("home");
    }
}

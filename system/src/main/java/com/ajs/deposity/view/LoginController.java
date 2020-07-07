package com.ajs.deposity.view;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;

public class LoginController {

    @FXML
    private void Acessar() throws IOException {
        App.alternarTela("home");
    }

    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
}

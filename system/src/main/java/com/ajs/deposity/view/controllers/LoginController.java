package com.ajs.deposity.view.controllers;

import java.io.IOException;
import com.ajs.deposity.view.App;
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

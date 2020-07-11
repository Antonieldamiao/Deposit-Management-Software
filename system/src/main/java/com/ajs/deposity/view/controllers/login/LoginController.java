package com.ajs.deposity.view.controllers.login;

import java.io.IOException;
import com.ajs.deposity.view.App;
import com.ajs.deposity.view.controllers.menu.Menu;
import javafx.application.Platform;
import javafx.fxml.FXML;

public class LoginController extends Menu {

    @FXML
    private void Acessar() throws IOException {
        App.alternarTela("home");
    }

}

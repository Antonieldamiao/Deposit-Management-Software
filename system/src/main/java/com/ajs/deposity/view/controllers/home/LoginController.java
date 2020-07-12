package com.ajs.deposity.view.controllers.home;

import java.io.IOException;

import com.ajs.deposity.model.dao.AdministradorDao;
import com.ajs.deposity.model.dao.ClienteDao;
import com.ajs.deposity.model.entities.Administrador;
import com.ajs.deposity.view.App;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.fxml.FXML;

import javax.persistence.PersistenceUnit;

public class LoginController {
    @FXML
    protected JFXPasswordField PfSenha;
    @FXML
    protected JFXTextField TfUsuario;

    @FXML
    private void Acessar() throws IOException {
        var usuario =TfUsuario.getText();
        var senha = PfSenha.getText();



        App.alternarTela("home");
    }

    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
}

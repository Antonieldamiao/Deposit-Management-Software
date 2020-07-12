package com.ajs.deposity.view.controllers.clients;

import com.ajs.deposity.model.dao.ClienteDao;
import com.ajs.deposity.model.entities.Cliente;
import com.ajs.deposity.view.App;
import com.ajs.deposity.view.controllers.home.Menu;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javax.swing.*;

public class NewClientController extends Menu {
    @FXML
    protected JFXTextField tfClientName;
    @FXML
    protected JFXTextField tfClientCPF;
    @FXML
    protected JFXTextField tfClientID;
    @FXML
    protected JFXTextField tfClientTelephone;
    @FXML
    protected JFXTextField tfClientStreet;
    @FXML
    protected JFXTextField tfClientCity;
    @FXML
    protected JFXTextField tfClientState;
    @FXML
    protected JFXTextField tfClientDistrict;
    @FXML
    protected JFXTextField tfClientCEP;
    @FXML
    protected JFXTextField tfClientCity1;
    @FXML
    protected JFXButton btnSaveClient;
    @FXML
    protected JFXDatePicker datePickerClient;

    @FXML
    protected void initialize() {
        App.addOnChangeScreenListerner((newScreen, userData) -> {
            if (newScreen.equals("novocliente")){
                tfClientID.setText("");
                tfClientName.setText("");

            }
        });
    }



    @FXML
    protected void novo(javafx.event.ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null, "entrou p@#&*");
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente(
                tfClientID.getText(),
                tfClientCPF.getText(),
                tfClientName.getText(),
                datePickerClient.getValue(),
                tfClientTelephone.getText());

        System.out.println(cliente.toString());

    }

}

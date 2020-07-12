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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewClientController extends Menu {
    @FXML
    public JFXButton btnCancellClient;
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
        LocalDate data = LocalDate.of(2020,01,20);
        Cliente cliente = new Cliente(
                tfClientID.getText(),
                tfClientCPF.getText(),
                tfClientName.getText(),
                data,
                tfClientTelephone.getText());

        clienteDao.addEntitie(cliente);
        String id = tfClientID.getText();
        String cpf =      tfClientCPF.getText();
        String nome =      tfClientName.getText() ;
        System.out.println(id+data+nome+cpf);
        System.out.println(cliente.toString());




    }

}

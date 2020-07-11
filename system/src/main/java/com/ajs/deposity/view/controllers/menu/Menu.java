package com.ajs.deposity.view.controllers.menu;

import com.ajs.deposity.view.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import java.io.IOException;

public class Menu {

    @FXML
    private void backHomeScreen() throws IOException {
        App.alternarTela("home");
    }

    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void products() throws IOException{
        App.alternarTela("products");
    }

    @FXML
    private void newProduct() throws IOException {
        App.alternarTela("newproduct");
    }

    @FXML
    private void editProduct() throws IOException {
        App.alternarTela("editproduct");
    }

    @FXML
    private void clients() throws IOException {
        App.alternarTela("clients");
    }

    @FXML
    private void newClient() throws IOException {
        App.alternarTela("newclient");
    }

    @FXML
    private void editClient() throws IOException {
        App.alternarTela("editclient");
    }

    @FXML
    private void sales() throws IOException{
        App.alternarTela("sales");
    }

    @FXML
    private void newSale() throws IOException {
        App.alternarTela("newsale");
    }

    @FXML
    private void editSale() throws IOException {
        App.alternarTela("editsale");
    }

    @FXML
    private void birthdays() throws IOException{
        App.alternarTela("birthdays");
    }

    @FXML
    private void reports() throws IOException{
        App.alternarTela("reports");
    }

    @FXML
    private void logOff() throws IOException {
        App.alternarTela("login");
    }

}

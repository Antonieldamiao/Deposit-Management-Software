package com.ajs.deposity.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Stage stage;
    private static Scene sceneLogin;
    private static Scene sceneHome;
    private static Scene sceneProducts;
    private static Scene sceneNewProduct;
    private static Scene sceneEditProduct;
    private static Scene sceneClients;
    private static Scene sceneNewClient;
    private static Scene sceneEditClient;
    private static Scene sceneSales;
    private static Scene sceneReports;

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent fxmlLogin = loadFXML("login");
        sceneLogin = new Scene(fxmlLogin);

        Parent fxmlHome = loadFXML("home");
        sceneHome = new Scene(fxmlHome);

        Parent fxmlProducts = loadFXML("products");
        sceneProducts = new Scene(fxmlProducts);

        Parent fxmlNewProduct = loadFXML("newproduct");
        sceneNewProduct = new Scene(fxmlNewProduct);

        Parent fxmlEditProduct = loadFXML("editproduct");
        sceneEditProduct = new Scene(fxmlEditProduct);

        Parent fxmlClients = loadFXML("clients");
        sceneClients = new Scene(fxmlClients);

        Parent fxmlNewClient = loadFXML("newclient");
        sceneNewClient = new Scene(fxmlNewClient);

        Parent fxmlEditClient = loadFXML("editclient");
        sceneEditClient = new Scene(fxmlEditClient);

        Parent fxmlSales = loadFXML("sales");
        sceneSales = new Scene(fxmlSales);

        Parent fxmlReports = loadFXML("reports");
        sceneReports = new Scene(fxmlReports);

        stage = primaryStage;
        primaryStage.setTitle("Depósito - Login");
        primaryStage.setScene(sceneLogin);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("img/icons8-finalizar-pedido.png")));
        primaryStage.show();

    }

    public static void alternarTela(String tela, Object userData) {
        switch(tela) {
            case "login":
                stage.setScene(sceneLogin);
                stage.setTitle("Depósito - Login");
                stage.setResizable(false);
                notifyAllListeners("login", userData);
                break;
            case "home":
                stage.setScene(sceneHome);
                stage.setTitle("Depósito - Início");
                stage.setResizable(false);
                notifyAllListeners("home", userData);
                break;
            case "products":
                stage.setScene(sceneProducts);
                stage.setTitle("Depósito - Produtos");
                stage.setResizable(false);
                notifyAllListeners("products", userData);
                break;
            case "newproduct":
                stage.setScene(sceneNewProduct);
                stage.setTitle("Depósito - Adicionar Produto");
                stage.setResizable(false);
                notifyAllListeners("newproduct", userData);
                break;
            case "editproduct":
                stage.setScene(sceneEditProduct);
                stage.setTitle("Depósito - Editar Produto");
                stage.setResizable(false);
                notifyAllListeners("editproduct", userData);
                break;
            case "clients":
                stage.setScene(sceneClients);
                stage.setTitle("Depósito - Clientes");
                stage.setResizable(false);
                notifyAllListeners("clients", userData);
                break;
            case "newclient":
                stage.setScene(sceneNewClient);
                stage.setTitle("Depósito - Adicionar Cliente");
                stage.setResizable(false);
                notifyAllListeners("newclient", userData);
                break;
            case "editclient":
                stage.setScene(sceneEditClient);
                stage.setTitle("Depósito - Editar Cliente");
                stage.setResizable(false);
                notifyAllListeners("editclient", userData);
                break;
            case "sales":
                stage.setScene(sceneSales);
                stage.setTitle("Depósito - Vendas");
                stage.setResizable(false);
                notifyAllListeners("sales", userData);
                break;
            case "reports":
                stage.setScene(sceneReports);
                stage.setTitle("Depósito - Relatórios");
                stage.setResizable(false);
                notifyAllListeners("reports", userData);
                break;
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void alternarTela(String tela) {
        alternarTela(tela,null);
    }

    public static void main(String[] args) {
        launch();
    }

    private static ArrayList<OnChangeScreen> listeners = new ArrayList<>();

    public static interface OnChangeScreen {
        void onScreenChanged(String newScreen, Object userData);
    }

    public static void addOnChangeScreenListerner(OnChangeScreen newListerner){
        listeners.add(newListerner);
    }

    private static void notifyAllListeners(String newScreen, Object userData){
        for (OnChangeScreen l : listeners){
            l.onScreenChanged(newScreen, userData);
        }

    }

}
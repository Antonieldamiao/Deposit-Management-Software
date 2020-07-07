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

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent fxmlLogin = loadFXML("login");
        sceneLogin = new Scene(fxmlLogin);

        Parent fxmlHome = loadFXML("home");
        sceneHome = new Scene(fxmlHome);

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
                stage.setResizable(true);
                notifyAllListeners("home", userData);
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
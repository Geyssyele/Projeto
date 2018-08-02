/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ben
 */
public class Main extends Application {
    //armazenando o stage e as duas secenas
    private static Stage stage;
    
    private static Scene mainScene;
    private static Scene detailsScene;


    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("Exemplo dessa porra");
        
//carregamento dos FXML separados
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("../visu/mainScreen.fxml"));//carrega o mainScreen ||  primeira tela    
        mainScene = new Scene(fxmlMain, 640, 400);//objeto de scena da main


        Parent fxmlDetails = FXMLLoader.load(getClass().getResource("../visu/detailsScreen.fxml"));//carrega o fxml details
        detailsScene = new Scene(fxmlDetails, 640, 400);//objeto de scena da details
       
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    //método para trocar de tela
    public static void changeScreen(String scr, Object userData){
        switch (scr){
            case "main":
            stage.setScene(mainScene);
                notifyAllListeners("main", userData);
            break;
            case "details":
            stage.setScene(detailsScene);
                notifyAllListeners("details", userData);
            break;
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    //-----------------------------------------------
    private static ArrayList<OnChangeScreen> listeners = new ArrayList<>();//array lista mostra os listados

    public static interface OnChangeScreen{//evento  (OnChangeScreen são os listados)
        void onScreenChanged(String newScreen, Object userData);//evento
    }
    
//forma de cadastrar os listeners
    public static void addOnChangeScreenListener(OnChangeScreen newListener ){
        listeners.add(newListener);
    }
    
    private static void notifyAllListeners(String newScreen, Object userData){
        for(OnChangeScreen l : listeners)
            l.onScreenChanged(newScreen, userData);
    }
}









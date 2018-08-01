/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    public static void changeScreen(String scr){
        switch (scr){
            case "main":
            stage.setScene(mainScene);
            break;
            case "details":
            stage.setScene(detailsScene);
            break;
        }
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

package controller;

import controller.Main.OnChangeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 *
 * @author ben
 */
public class DetailsController{
    
    @FXML
    protected void initialize(){
        Main.addOnChangeScreenListener(new OnChangeScreen(){;
            @Override
            public void onScreenChanged(String newScreen, Object userData) {
                
                //certificar de que a tela nova é a que eu t trabalhando
                if(newScreen.equals("details")){
                    System.out.println("Nova Tela: "+ newScreen+" ,"+ userData);
                }
            }
        });
    }
    @FXML
    protected void btnVoltar(ActionEvent e) {
        Main.changeScreen("main");
    }  
}
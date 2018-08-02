package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 *
 * @author ben
 */
public class DetailsController{
    
    @FXML
    protected void inicialize(){
        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Object userData) {
                System.out.println("Nova Tela"+ newScreen+","+ userData);
            }
        });
    }
    @FXML
    protected void btnVoltar(ActionEvent e) {
        System.out.println("voltou");
        Main.changeScreen("main");
    }  
}
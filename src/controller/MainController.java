/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 *
 * @author ben
 */
public class MainController{
    @FXML
    protected void btNovoAction(ActionEvent e) {
        Main.changeScreen("details", "dados para a tela detalhes");
    }   
}
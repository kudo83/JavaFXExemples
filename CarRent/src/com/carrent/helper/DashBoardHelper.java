/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.helper;

import com.carrent.Main;
import com.carrent.controller.DashboardController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Aissam
 */
public class DashBoardHelper {
    public static void loadMenuContent(String pane, AnchorPane contentPane){
        try {
            AnchorPane content = FXMLLoader.load(Main.class.getResource("fxml/"+pane+".fxml"));

            contentPane.getChildren().setAll(content);
            contentPane.setMinWidth(content.getMinWidth());
            contentPane.setMinHeight(content.getMinHeight());

        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

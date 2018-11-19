/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.helper;

import com.carrent.Main;
import com.carrent.controller.DashboardController;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Aissam
 */
public class DashboardHelper {

    public static void loadMenuContent(String pane, AnchorPane contentPane) {
        try {
            AnchorPane content = FXMLLoader.load(Main.class.getResource("fxml/" + pane + ".fxml"));

            contentPane.getChildren().setAll(content);
            contentPane.setMinWidth(content.getMaxWidth());
            contentPane.setMinHeight(content.getMaxHeight());

        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void addDecorationToMenuItem(JFXButton btn) {
        btn.getStyleClass().removeAll("menu-item");
        btn.getStyleClass().add("menu-item-selected");
        btn.getGraphic().getStyleClass().removeAll("glyph");
        btn.getGraphic().getStyleClass().add("glyph-selected");
    }
    
    public static void removeDecorationToMenuItem(JFXButton btn) {
       btn.getStyleClass().removeAll("menu-item-selected");
        btn.getStyleClass().add("menu-item");
        btn.getGraphic().getStyleClass().removeAll("glyph-selected");
        btn.getGraphic().getStyleClass().add("glyph");
    }
}

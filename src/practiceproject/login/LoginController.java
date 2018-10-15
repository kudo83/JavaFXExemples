/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject.login;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Aissam
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton BtnSignIn;
    @FXML
    private JFXButton BtnSignUp;
    @FXML
    private AnchorPane signInPane;
    @FXML
    private AnchorPane signUpPane;
    @FXML
    private JFXButton loginBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }

    @FXML
    private void onMenuAction(ActionEvent event) {
        BtnSignIn.getStyleClass().removeAll("menuButtonSelected", "menuButton");
        BtnSignUp.getStyleClass().removeAll("menuButtonSelected", "menuButton");

        if (event.getSource() == BtnSignIn) {
            BtnSignIn.getStyleClass().add("menuButtonSelected");
            BtnSignUp.getStyleClass().add("menuButton");
            signInPane.toFront();

        } else {
            BtnSignIn.getStyleClass().add("menuButton");
            BtnSignUp.getStyleClass().add("menuButtonSelected");
            signUpPane.toFront();
        }
    }

    @FXML
    private void onLogin(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../dashborad/Dashbord.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Dashboard");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

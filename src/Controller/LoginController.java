package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML private Button buttonEntrar;

    @FXML private Button buttonSair;

    @FXML private PasswordField passPassword;

    @FXML private TextField txUser;

    @FXML public void onButtonEntrarAction(){
    }

    @FXML public void onButtonSairAction(){
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}


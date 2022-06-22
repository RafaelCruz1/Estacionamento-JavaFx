package Controller;

import Model.Main;
import Model.Principal;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button buttonEntrar;

    @FXML
    private Button buttonSair;

    @FXML
    private PasswordField passPassword;

    @FXML
    private TextField txUser;

    @FXML
    public void onButtonEntrarAction() {

        if (txUser.getText().equals("") && passPassword.getText().equals("123456")) {
            Principal p = new Principal();
            fecha();
            try {
                p.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alerts.showAlert("Erro", "Erro login", "Usuario ou senha incorreta.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void onButtonSairAction() {
        fecha();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void fecha() {
        Main.getStage().close();
    }
}


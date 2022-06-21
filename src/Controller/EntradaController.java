package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EntradaController implements Initializable {

    @FXML
    private Button ButtonSalvar;

    @FXML
    private Button buttonCancelar;

    @FXML
    private TextField txPlaca;

    @FXML
    public void onButtonCancelarAction() {
    }

    @FXML
    public void onButtonSalvarAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


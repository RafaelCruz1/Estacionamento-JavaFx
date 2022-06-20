package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonEntrada;

    @FXML
    private Button buttonSaida;

    @FXML
    public void onButtonEditarAction(){
        System.out.println("===Editar===");
    }

    @FXML
    public void onButtonEntradaAction(){
        System.out.println("===Entrada===");
    }
    @FXML
    public void onButtonSaidaAction(){
        System.out.println("===Saida===");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

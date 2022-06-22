package Controller;

import Model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalController implements Initializable {

    @FXML
    private Button buttonEditar;
    @FXML
    private Button buttonEntrada;
    @FXML
    private Button buttonSaida;
    @FXML
    private Button buttonSair;
    @FXML
    private ComboBox<?> cboxVeiculosEstacionados;


    @FXML
    public void onButtonEditarAction() {
        EditarVeiculo editV = new EditarVeiculo();
        try {
            editV.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onButtonEntradaAction() {
        Entrada entrada = new Entrada();
        fechar();
        try {
            entrada.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onButtonSaidaAction() {
       Saida saida = new Saida();
       fechar();
        try {
            saida.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void fechar() {
        Principal.getStage().close();
    }
}


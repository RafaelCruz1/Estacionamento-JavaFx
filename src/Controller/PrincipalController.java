package Controller;

import Model.EditarVeiculo;
import Model.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalController implements Initializable {

    @FXML private Button buttonEditar;
    @FXML private Button buttonEntrada;
    @FXML private Button buttonSaida;
    @FXML private Button buttonSair;
    @FXML private TableView<?> tbvTabela;


    @FXML public void onButtonEditarAction() {
        EditarVeiculo editV = new EditarVeiculo();
        try {
            editV.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML public void onButtonEntradaAction() {
    }

    @FXML public void onButtonSaidaAction() {
    }

    @FXML public void onButtonSairAction(){

        Principal.getStage().close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}


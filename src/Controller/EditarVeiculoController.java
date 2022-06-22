package Controller;

import Model.EditarVeiculo;
import Model.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EditarVeiculoController implements Initializable {


    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextField txAlterarModelo;

    @FXML
    private TextField txAlterarPlaca;

    @FXML
    void onButtonCancelarAction() {
        Principal p = new Principal();
        fecha();
        try {
            p.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onButtonSalvarAction() {
    }

    @FXML
    void onTxAlterarModeloAction() {
    }

    @FXML
    void onTxAlterarPlacaAction() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void fecha(){
        EditarVeiculo.getStage().close();
    }
}

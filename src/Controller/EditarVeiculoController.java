package Controller;

import Model.EditarVeiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class EditarVeiculoController implements Initializable {

    @FXML
    private Button buttonVoltar;

    @FXML
    void onButtonVoltarAction(ActionEvent event) {
        EditarVeiculo.getStage().close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

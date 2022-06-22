package Controller;

import Model.Entrada;
import Model.Main;
import Model.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class EntradaController implements Initializable {

    @FXML
    private Button ButtonSalvar;

    @FXML
    private Button buttonCancelar;

    @FXML
    private TextField txPlaca;

    @FXML
    private TextField txtModelo;

    @FXML
    private Label lblHora;

    @FXML
    public void onButtonCancelarAction() {
        Entrada.getStage().close();
        Principal.getStage().show();
    }

    @FXML
    public void onButtonSalvarAction() {
        String modelo, placa;

        modelo = txtModelo.getText();
        placa = txPlaca.getText();

        Entrada objVeiculo = new Entrada();
        objVeiculo.setModel(modelo);
        objVeiculo.getPlate(placa);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

}


package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import sample.Main;
import java.io.IOException;
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

    private void loadView(String absoluteName){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVbox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu= mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVbox);

        }catch (IOException e){
            Alerts.showAlert("IOException","Error loading view",e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}

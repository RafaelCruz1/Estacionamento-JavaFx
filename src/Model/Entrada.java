package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Entrada extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/EntradaVeiculo.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Entrada");
        stage.setScene(scene);
        stage.show();
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Entrada.stage = stage;
    }

    private String model;
    private String plate;

    public Entrada() {
    }

    public Entrada(String model, String plate) {
        this.model = model;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate(String placa) {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

}

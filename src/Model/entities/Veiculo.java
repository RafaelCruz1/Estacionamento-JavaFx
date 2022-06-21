package Model.entities;

import java.util.Objects;

public class Veiculo {
    private String model;
    private String plate;

    public Veiculo() {
    }

    public Veiculo(String model, String plate) {
        this.model = model;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(model, veiculo.model) &&
                Objects.equals(plate, veiculo.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, plate);
    }

    @Override
    public String toString() {
        return "Veiculo" +
                " model=" + model +
                ", plate= " + plate;
    }
}

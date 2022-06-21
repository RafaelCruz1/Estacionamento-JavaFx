package Model.services;

import Model.entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoServices {
    public List<Veiculo> findAll() {

        List<Veiculo> list = new ArrayList<>();
        list.add(new Veiculo("Corsa", "ABC-4567"));
        list.add(new Veiculo("Corsa sedan", "ABF-4877"));
        list.add(new Veiculo("Corsa wind", "ABC-4568"));

        return list;
    }
}

package br.com.lab08.ex03;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {

    List<VeiculoAbstract> veiculos = new ArrayList<>();

    public void adicionaVeiculo(VeiculoAbstract veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void visitarVeiculos(VehicleVisitor visitor) {
        for (VeiculoAbstract veiculo : veiculos) {
            veiculo.accept(visitor);
        }
    }
}

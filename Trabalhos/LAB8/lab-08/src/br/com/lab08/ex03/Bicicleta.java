package br.com.lab08.ex03;

public class Bicicleta extends VeiculoAbstract {

    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}

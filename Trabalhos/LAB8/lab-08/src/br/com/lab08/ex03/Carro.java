package br.com.lab08.ex03;

public class Carro extends VeiculoAbstract{
    private String cor;
    private String marca;
    private String modelo;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}

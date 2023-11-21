package br.com.lab08.ex03;

public class Onibus extends VeiculoAbstract {

    private int quantidadeDeLugares;
    private int anoDeFabricacao;

    public Onibus(int quantidadeDeLugares, int anoDeFabricacao) {
        this.quantidadeDeLugares = quantidadeDeLugares;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    @Override
    void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}

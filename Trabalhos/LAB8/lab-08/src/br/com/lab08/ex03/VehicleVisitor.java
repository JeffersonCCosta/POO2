package br.com.lab08.ex03;

public interface VehicleVisitor {

    void visit(Carro carro);
    void visit(Onibus onibus);
    void visit(Bicicleta bicicleta);
}

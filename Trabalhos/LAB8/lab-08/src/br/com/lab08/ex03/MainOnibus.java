package br.com.lab08.ex03;

public class MainOnibus {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        Onibus onibus1 = new Onibus(20, 2020);
        Onibus onibus2 = new Onibus(10, 2025);
        Onibus onibus3 = new Onibus(50, 2030);

        veiculo.adicionaVeiculo(onibus1);
        veiculo.adicionaVeiculo(onibus2);
        veiculo.adicionaVeiculo(onibus3);

        VehicleMessageVisitor messageVisitor = new VehicleMessageVisitor();

        veiculo.visitarVeiculos(messageVisitor);
    }
}

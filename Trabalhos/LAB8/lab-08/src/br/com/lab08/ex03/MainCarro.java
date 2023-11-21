package br.com.lab08.ex03;

public class MainCarro {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        Carro carro1 = new Carro("Preto", "Porsche", "718 Cayman GT4");
        Carro carro2 = new Carro("Rosa", "Honda", "Honda Civic");
        Carro carro3 = new Carro("Vermelho", "BMW", "X6");


        veiculo.adicionaVeiculo(carro1);
        veiculo.adicionaVeiculo(carro2);
        veiculo.adicionaVeiculo(carro3);

        VehicleMessageVisitor messageVisitor = new VehicleMessageVisitor();

        veiculo.visitarVeiculos(messageVisitor);
    }
}

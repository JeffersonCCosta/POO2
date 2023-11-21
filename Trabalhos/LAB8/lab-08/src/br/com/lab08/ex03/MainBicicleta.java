package br.com.lab08.ex03;

public class MainBicicleta {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        Bicicleta bicicleta1 = new Bicicleta("Preta");
        Bicicleta bicicleta2 = new Bicicleta("Vermelha");
        Bicicleta bicicleta3 = new Bicicleta("Azul");

        veiculo.adicionaVeiculo(bicicleta1);
        veiculo.adicionaVeiculo(bicicleta2);
        veiculo.adicionaVeiculo(bicicleta3);

        VehicleMessageVisitor messageVisitor = new VehicleMessageVisitor();

        veiculo.visitarVeiculos(messageVisitor);
    }
}

package br.com.lab08.ex03;

public class VehicleMessageVisitor implements VehicleVisitor{


    @Override
    public void visit(Carro carro) {
        System.out.println("Carro > Cor: " + carro.getCor() + ", Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
        System.out.println("Favor atualizar dadosdo IPVA!\n");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Ônibus > Quantidade de Lugares: " + onibus.getQuantidadeDeLugares() + ", Ano de Fabricação: " + onibus.getAnoDeFabricacao());
        System.out.println("Atenção para atualização das licenças!\n");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta > Cor: " + bicicleta.getCor());
        System.out.println("Comemore no parque o dia do ciclismo!\n");
    }
}

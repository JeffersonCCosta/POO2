package br.com.lab03.ex01;

public class Pizzaria {

    public static void main(String[] args) {

        Pizza massaFina = new MassaFinaPizza();
        Pizza pizza1 = new Ovo( new Tomate(new Queijo(massaFina)));
        System.out.println(pizza1.getDescricao());
        System.out.println("Valor total da Pizza: R$" + pizza1.custo());

        System.out.println("\n");

        Pizza massaEspessa = new MassaEspessaPizza();
        Pizza pizza2 = new Tomate(new Ovo(new Queijo(new Bacon(massaEspessa))));
        System.out.println(pizza2.getDescricao());
        System.out.println("Valor total da Pizza: R$" + pizza2.custo());
    }
}

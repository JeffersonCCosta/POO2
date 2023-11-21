package br.com.lab03.ex02;

public class Cafeteria {
    public static void main(String[] args) {

        Bebida espresso = new Espresso();
        Bebida cafe1 = new Chocolate(new Chantilly(espresso));
        System.out.println(cafe1.getDescricao());
        System.out.println("Valor total do Cafe Espresso R$" + cafe1.custo());

        System.out.println("\n");

        Bebida descafeinado = new Decaf();
        Bebida cafe2 = new Chocolate(new Leite(new Canela(new Acucar(descafeinado))));
        System.out.println(cafe2.getDescricao());
        System.out.println("Valor total do Cafe Descafeinado R$" + cafe2.custo());
    }
}

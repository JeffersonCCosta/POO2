package br.com.lab03.ex01;

public class Tomate extends ToppingDecorator{

    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 4.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + "tomate | ";
    }

}

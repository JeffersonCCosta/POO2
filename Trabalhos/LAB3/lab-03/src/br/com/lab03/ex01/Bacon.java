package br.com.lab03.ex01;

public class Bacon extends ToppingDecorator{

    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 10.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + "bacon | ";
    }
}

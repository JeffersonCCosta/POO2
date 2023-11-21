package br.com.lab03.ex01;

public class Ovo extends ToppingDecorator{

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 3.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + "ovo | ";
    }
}

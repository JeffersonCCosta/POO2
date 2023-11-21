package br.com.lab03.ex01;

public class Queijo extends ToppingDecorator{

    public Queijo (Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 8.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + "queijo | ";
    }
}

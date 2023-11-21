package br.com.lab03.ex01;

public class ToppingDecorator implements Pizza{

    Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double custo() {
        return pizza.custo();
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }
}

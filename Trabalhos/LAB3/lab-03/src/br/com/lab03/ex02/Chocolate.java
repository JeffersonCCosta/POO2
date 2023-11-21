package br.com.lab03.ex02;

import br.com.lab03.ex01.Pizza;

public class Chocolate extends CafeteriaDecorator{

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double custo() {
        return bebida.custo() + 9.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Chocolate | ";
    }
}

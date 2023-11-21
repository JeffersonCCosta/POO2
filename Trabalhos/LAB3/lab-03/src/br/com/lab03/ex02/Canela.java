package br.com.lab03.ex02;

public class Canela extends CafeteriaDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double custo() {
        return bebida.custo() + 2.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Canela | ";
    }
}

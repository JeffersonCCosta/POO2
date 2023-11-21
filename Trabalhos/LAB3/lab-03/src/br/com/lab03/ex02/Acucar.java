package br.com.lab03.ex02;

public class Acucar extends CafeteriaDecorator{

    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double custo() {
        return bebida.custo() + 1.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Açucar | ";
    }
}

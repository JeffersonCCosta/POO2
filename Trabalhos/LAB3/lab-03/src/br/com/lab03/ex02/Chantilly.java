package br.com.lab03.ex02;

public class Chantilly extends CafeteriaDecorator{

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double custo() {
        return bebida.custo() + 10.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Chantilly | ";
    }
}

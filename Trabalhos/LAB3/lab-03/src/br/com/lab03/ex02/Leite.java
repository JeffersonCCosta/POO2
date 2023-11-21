package br.com.lab03.ex02;

public class Leite extends CafeteriaDecorator{

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double custo() {
        return bebida.custo() + 5.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Leite | ";
    }
}

package br.com.lab03.ex02;

public class CafeteriaDecorator implements Bebida{

    protected Bebida bebida;

    public CafeteriaDecorator (Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public double custo(){
        return bebida.custo();
    }

    @Override
    public String getDescricao(){
        return bebida.getDescricao();
    }
}

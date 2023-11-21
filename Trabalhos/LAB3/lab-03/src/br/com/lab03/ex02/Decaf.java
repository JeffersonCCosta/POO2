package br.com.lab03.ex02;

public class Decaf implements Bebida{

    @Override
    public double custo() {
        return 20.00;
    }

    @Override
    public String getDescricao() {
        return "Descafeinado com adicional de ";
    }
}

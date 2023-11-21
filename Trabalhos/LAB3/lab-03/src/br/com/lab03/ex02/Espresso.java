package br.com.lab03.ex02;

public class Espresso implements Bebida{

    @Override
    public double custo() {
        return 10.00;
    }

    @Override
    public String getDescricao() {
        return "Espresso com adicional de ";
    }
}

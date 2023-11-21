package br.com.lab03.ex01;

public class MassaFinaPizza implements Pizza{

    @Override
    public double custo() {
        return 50.00;
    }

    @Override
    public String getDescricao() {
        return "Pizza de massa fina com: ";
    }
}

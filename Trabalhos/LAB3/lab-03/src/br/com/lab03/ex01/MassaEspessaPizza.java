package br.com.lab03.ex01;

public class MassaEspessaPizza implements Pizza{

    @Override
    public double custo(){
        return 60.0;
    }

    @Override
    public String getDescricao(){
        return "Pizza de massa espessa com: ";
    }
}

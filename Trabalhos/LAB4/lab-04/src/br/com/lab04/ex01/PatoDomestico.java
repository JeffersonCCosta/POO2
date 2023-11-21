package br.com.lab04.ex01;

public class PatoDomestico implements Pato{

    @Override
    public void grasnar(){
        System.out.println("br.com.lab04.ex01.Pato grasnando!");
    }

    @Override
    public void voar(){
        System.out.println("br.com.lab04.ex01.Pato voando!");
    }
}

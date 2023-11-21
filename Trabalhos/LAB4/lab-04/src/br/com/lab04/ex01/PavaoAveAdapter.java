package br.com.lab04.ex01;

public class PavaoAveAdapter implements Ave {

    Pavao pavao;

    public PavaoAveAdapter(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar(){
    System.out.println("Pavão não VOA!");
    }

    @Override
    public void emitirSom(){
        pavao.pupilar();
    }
}

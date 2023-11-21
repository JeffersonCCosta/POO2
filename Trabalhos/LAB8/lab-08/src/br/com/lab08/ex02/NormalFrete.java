package br.com.lab08.ex02;

public class NormalFrete implements FreteStrategy {

    @Override
    public int calculaFrete() {
        return 10;
    }
}

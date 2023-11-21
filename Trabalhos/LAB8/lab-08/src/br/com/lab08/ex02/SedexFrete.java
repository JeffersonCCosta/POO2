package br.com.lab08.ex02;

public class SedexFrete  implements FreteStrategy {

    @Override
    public int calculaFrete() {
        return 30;
    }
}

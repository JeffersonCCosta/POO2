package br.com.lab06.ex02;

import java.util.Random;

public class SimuladorVariacaoPreco {

    private Acao acao;

    public SimuladorVariacaoPreco(Acao acao) {
        this.acao = acao;
    }

    public void simularVariacao(int numeroIteracoes) {
        Random rand = new Random();
        for (int i = 0; i < numeroIteracoes; i++) {
            // Preço aleatório entre 50 e 110
            double novoPreco = 50 + rand.nextDouble() * 60;
            acao.setPrecoAtual(novoPreco);
        }
    }

}

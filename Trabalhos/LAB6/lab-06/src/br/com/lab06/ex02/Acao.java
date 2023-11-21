package br.com.lab06.ex02;

import java.util.ArrayList;
import java.util.List;

public class Acao {

    private String nome;
    private double precoAtual;
    private List<InvestidorObserver> observadores = new ArrayList<>();

    public Acao(String nome) {
        this.nome = nome;

        // Preço inicial
        this.precoAtual = 0.0;
    }

    public void adicionarObservador(InvestidorObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(InvestidorObserver observador) {
        observadores.remove(observador);
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
        notificarObservadores();
    }

    public void notificarObservadores() {
        for (InvestidorObserver observador : observadores) {
            observador.atualizar(precoAtual);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

}

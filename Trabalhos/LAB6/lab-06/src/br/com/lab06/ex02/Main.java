package br.com.lab06.ex02;

public class Main {

    public static void main(String[] args) {
        Acao acao = new Acao("AcaoXYZ");
        AcaoBroker corretor = new AcaoBroker();

        Investidor investidor1 = new Investidor("Investidor1", corretor, 500.0, 8000.0);
        Investidor investidor2 = new Investidor("Investidor2", corretor, 100.0, 1000.0);

        acao.adicionarObservador(investidor1);
        acao.adicionarObservador(investidor2);

        SimuladorVariacaoPreco simulador = new SimuladorVariacaoPreco(acao);
        // Simula variação de preço por 5 interações
        simulador.simularVariacao(2);
    }

}

package br.com.lab06.ex02;

public class Investidor implements InvestidorObserver{

    private String nome;
    private AcaoBroker corretor;
    private double precoMinimo;
    private double precoMaximo;

    public Investidor(String nome, AcaoBroker corretor, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.corretor = corretor;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        corretor.adicionarInvestidor(this);
    }

    @Override
    public void atualizar(double precoAcao) {
        if (precoAcao >= precoMaximo) {
            System.out.println(nome + " vendeu suas ações devido ao preço máximo atingido.");
            corretor.venderAcao(this);
        } else if (precoAcao <= precoMinimo) {
            System.out.println(nome + " comprou mais ações devido ao preço mínimo atingido.");
            corretor.comprarAcao(this);
        }
    }

    public String getNome() {
        return nome;
    }

}

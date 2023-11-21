package br.com.lab06.ex02;

import java.util.ArrayList;
import java.util.List;

public class AcaoBroker {

    private List<Investidor> investidores = new ArrayList<>();

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    public void comprarAcao(Investidor investidor) {
        System.out.println("Corretor comprou ações para " + investidor.getNome());
    }

    public void venderAcao(Investidor investidor) {
        System.out.println("Corretor vendeu ações para " + investidor.getNome());
    }

}

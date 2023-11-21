package br.com.lab08.ex02;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total){
        System.out.println("Pagamento com Cartão!");
    }
}

package br.com.lab08.ex02;

public class MainNormal {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionaItem(new Item("Livro 1", 50));
        carrinhoDeCompras.adicionaItem(new Item("Tenis 2", 300));

        PagamentoStrategy pagamentoStrategy = new CartaoPagamento();

        FreteStrategy freteStrategy = new NormalFrete();
        carrinhoDeCompras.freteStrategy(freteStrategy);

        carrinhoDeCompras.exibirItensNoCarrinho();
        System.out.println("Valor do Carrinho R$" + carrinhoDeCompras.calculaTotal());
        System.out.println("Valor do Frete R$" + carrinhoDeCompras.calculaFrete());
        System.out.println("Valor Total com Frete Normal R$" + carrinhoDeCompras.calcularTotalComFrete());
        carrinhoDeCompras.realizaPagamento(pagamentoStrategy);
    }
}

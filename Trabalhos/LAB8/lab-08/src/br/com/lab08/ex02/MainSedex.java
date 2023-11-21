package br.com.lab08.ex02;

public class MainSedex {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionaItem(new Item("Livro 1", 100));
        carrinhoDeCompras.adicionaItem(new Item("Tenis 2", 500));

        PagamentoStrategy pagamentoStrategy = new PixPagamento();

        FreteStrategy freteStrategy = new SedexFrete();
        carrinhoDeCompras.freteStrategy(freteStrategy);

        carrinhoDeCompras.exibirItensNoCarrinho();
        System.out.println("Valor do Carrinho R$" + carrinhoDeCompras.calculaTotal());
        System.out.println("Valor do Frete R$" + carrinhoDeCompras.calculaFrete());
        System.out.println("Valor Total com Frete em Sedex R$" + carrinhoDeCompras.calcularTotalComFrete());
        carrinhoDeCompras.realizaPagamento(pagamentoStrategy);
    }
}

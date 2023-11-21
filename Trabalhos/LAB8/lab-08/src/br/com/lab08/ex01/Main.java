package br.com.lab08.ex01;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionaItem(new Item("Livro 1", 50));
        carrinhoDeCompras.adicionaItem(new Item("Caderno 1", 10));


        PagamentoStrategy cartao = new CartaoPagamento();
        System.out.println("\n" + carrinhoDeCompras.calculaTotal());
        carrinhoDeCompras.realizaPagamento(cartao);

        System.out.println("\n");

        PagamentoStrategy pix = new PixPagamento();
        System.out.println(carrinhoDeCompras.calculaTotal());
        carrinhoDeCompras.realizaPagamento(pix);


    }
}

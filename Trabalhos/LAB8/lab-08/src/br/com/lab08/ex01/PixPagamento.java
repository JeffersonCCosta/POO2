package br.com.lab08.ex01;

public class PixPagamento implements PagamentoStrategy{

    @Override
    public void pagar (int total){
        System.out.println("Pagamento em Pix");
    }
}

package br.com.lab07.ex02;

public class PedidosNaLoja extends PedidoTemplate{

    @Override
    protected void processarPagamento(){
        System.out.println("Processando pagamento na Loja!");
    }

    // Não há entrega para pedidos na loja
    @Override
    protected boolean verificarEntrega(){
        return false;
    }

}

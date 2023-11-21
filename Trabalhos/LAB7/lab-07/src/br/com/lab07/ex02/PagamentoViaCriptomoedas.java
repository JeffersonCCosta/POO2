package br.com.lab07.ex02;

public class PagamentoViaCriptomoedas extends PedidoTemplate{

    @Override
    protected void processarPagamento(){
        System.out.println("Processando pagamento via Criptomoedas!");
    }

    // Sempre há entrega para pedidos por Criptomoedas
    @Override
    protected boolean verificarEntrega(){
        return true;
    }
}

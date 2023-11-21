package br.com.lab07.ex02;

public class PedidosOnline extends PedidoTemplate{

    @Override
    protected void processarPagamento(){
        System.out.println("Processando pagamento Online!");
    }

    // Sempre há entrega para pedidos online
    @Override
    protected boolean verificarEntrega(){
        return true;
    }

}

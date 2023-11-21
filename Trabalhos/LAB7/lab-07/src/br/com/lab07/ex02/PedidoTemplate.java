package br.com.lab07.ex02;

abstract class PedidoTemplate {

    protected abstract void processarPagamento();

    protected abstract boolean verificarEntrega();

    public final void executarPedido(int quantidadeItens, double valorItem) {
        processarPagamento();
        if (verificarEntrega()) {
            System.out.println("Realizando a entrega dos itens.");
        } else {
            System.out.println("Pedido disponível para retirada na loja.");
        }
        double total = quantidadeItens * valorItem;
        System.out.println("Total do pedido: R$" + total);
    }
}

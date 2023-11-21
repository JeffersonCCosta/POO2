package br.com.lab07.ex02;

/**
 * Diferença entre o padrão Template e o padrão Decorator:
 * - Template define a estrutura do algoritmo em uma superclasse e permite que subclasses concretas o implementem.
 * - Decorator permite adicionar comportamento adicional a um objeto existente em tempo de execução.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Pedido online com pagamento tradicional:");
        PedidoTemplate pedidoOnline = new PedidosOnline();
        pedidoOnline.executarPedido(5, 20.0);

        System.out.println("\nPedido na loja com pagamento tradicional:");
        PedidoTemplate pedidoNaLoja = new PedidosNaLoja();
        pedidoNaLoja.executarPedido(3, 25.0);

        System.out.println("\nPedido online com pagamento via criptomoedas:");
        PedidoTemplate pedidoOnlineCriptomoedas = new PagamentoViaCriptomoedas();
        pedidoOnlineCriptomoedas.executarPedido(2, 30.0);
        pedidoOnlineCriptomoedas.executarPedido(3, 10.0);
    }
}

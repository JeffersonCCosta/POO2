package br.com.lab08.ex02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();
    private FreteStrategy freteStrategy;
    public void adicionaItem(Item item){
        items.add(item);
    }


    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculaTotal(){
        int sum = 0;
        for (Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void freteStrategy(FreteStrategy freteStrategy){
        this.freteStrategy = freteStrategy;
    }

    public int calculaFrete(){
        if (freteStrategy != null){
            return freteStrategy.calculaFrete();
        }
        return 0;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
    }

    public void exibirItensNoCarrinho() {
        System.out.println("Itens no carrinho: ");
        for (Item item : items) {
            System.out.println(item.getNome() + ": $" + item.getPreco());
        }
    }

    public int calcularTotalComFrete() {
        int totalAPagar = calculaTotal() + calculaFrete();
        return totalAPagar;
    }
}

package br.com.lab08.ex01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();

    public void adicionaItem(Item item){
        items.add(item);
    }

    public void remveItem(Item item){
        items.remove(item);
    }

    public int calculaTotal(){
        int sum = 0;

        for (Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
    }
}

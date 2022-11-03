package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;


public class Compra {

    List<Item> itens = new ArrayList<>();
    
    
    void adicionarItem (Item item) {
        this.itens.add(item);
    }
    void adicionarItem (Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }
    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }
    
    double obterValorTotal() {
        double total = 0; 
        
        for(Item itemTemporario: itens) {
            total += itemTemporario.produto.preco * itemTemporario.quantidade;
        }
        return total;
    }
}
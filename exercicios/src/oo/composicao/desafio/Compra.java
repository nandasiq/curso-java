package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;


public class Compra {

    List<Item> itens = new ArrayList<>();
    
   
    
    void adicionarItens (Item item) {
        this.itens.add(item);
    }
 
    public double obterTotalCompra(Item item) {
        double valorCompra = item.produto.preco * item.quantidade;
        return valorCompra;
    }
}

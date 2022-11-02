package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Maria");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        
        Produto produtoCaneta = new Produto("Caneta", 5.8);
        Produto produtoLapis = new Produto("Lapis", 2.5);
        
        Item item1 = new Item(produtoCaneta, 3);
        Item item2 = new Item(produtoLapis, 2);
        
        
        compra1.adicionarItens(new Item(produtoCaneta, 5));
        
        //System.out.println(compra1.obterTotalCompra(items[2]));
        
        
    }

}

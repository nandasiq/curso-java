package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Maria");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        
        Produto produtoCaneta = new Produto("Caneta", 5.8);
//        Produto produtoLapis = new Produto("Lapis", 2.5);
        
//        Item item1 = new Item(produtoCaneta, 3);
//        Item item2 = new Item(produtoLapis, 2);
//        Item item3 = new Item(produtoCaneta, 4);
//        Item item4 = new Item(produtoLapis, 6);
        
        
        compra1.adicionarItem(new Item(produtoCaneta, 5));
        compra1.adicionarItem("Notebook", 2000, 2);
        
        compra2.adicionarItem(new Produto("Agenda", 9.25), 1);
        compra2.adicionarItem("Tesoura", 6.8, 4);
        
        cliente1.compras.add(compra1);
        cliente1.adicionarCompra(compra2);
               
        
        System.out.println(cliente1.nome);
        
        System.out.println(compra1.obterValorTotal());
        System.out.println(compra2.obterValorTotal());
        System.out.println(cliente1.obterValorTotal());
        
        
    }

}

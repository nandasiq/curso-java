package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();
    
    Cliente (String nome) {
        this.nome = nome;
    }
    
    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
                
    }
    
    
    double obterValorTotal() {
        double total = 0;
        
        for (Compra compraTemporaria: compras) {
            total += compra.obterTotalCompra();
        }
        
        return total;
    }

}

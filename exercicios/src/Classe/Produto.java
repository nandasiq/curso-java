package Classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial){
        
        nome = nomeInicial;
        preco = precoInicial;
    }
    
    Produto(String nomeInicial){
        
        nome = nomeInicial;
    }
    
    Produto () {
        
    }
    
    double precoComDesconto(double descontoGerente) {
       
        return preco * (1 - desconto + descontoGerente);
    }
    
    double precoComDesconto() {
        
        return preco * (1 - desconto);
    }
}

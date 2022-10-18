package classe.desafio;

public class Pessoa {
    
    String nome = "";
    static double pesoP;
    
    Pessoa (String nome, double pesoP) {
        this.nome = nome;
        this.pesoP = pesoP;
    }

    
    static double comer(Comida c) {
        
         return  c.pesoC + pesoP; 
    }
}
package classe.desafio;

public class Pessoa {
    
    String nome = "";
    double pesoP;
    
    Pessoa (String nome, double pesoP) {
        this.nome = nome;
        this.pesoP = pesoP;
    }

    void comer (Comida comida) {
        this.pesoP += comida.pesoC;
    }
    
    String apresentar() {
        return "Oi, meu nome e " + nome + ". Eu peso " + pesoP;
    }
    
    //minha solucao que estava certa.
//    static double comer(Comida c) {
//         return  pesoP += c.pesoC; 
//    }
}
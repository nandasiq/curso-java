package classe.desafio;

public class Jantar {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Maria", 60); //instancia pessoa
        
        Comida c1 = new Comida("arroz", 0.3);
        Comida c2 = new Comida("feijao", 0.2);
        Comida c3 = new Comida("banana", 0.1);
        
        System.out.printf(p.apresentar());       
        p.comer(c1);
        p.comer(c2);
        p.comer(c3);
        
        System.out.printf("\nApos comer c2 e c3 eu tenho %.1f", p.pesoP);
                
    }

}

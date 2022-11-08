package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa fer = new Pessoa (60);
        fer.comer(new Arroz(0.1));
        fer.comer(new Feijao(0.2));
        fer.comer(new Sorvete(0.3));
        
        //Comida ingrediente3 = new Comida(0.30); nao funciona pq a classe comida e abstrada
        fer.comer(new Sorvete(0.3));        
        
        System.out.println(fer.getPeso());
    }

}

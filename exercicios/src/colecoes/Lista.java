package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        
        List<Usuario> lista = new ArrayList<>();  
        
        Usuario u1 = new Usuario("Ana");
        
        lista.add(u1);
        lista.add(new Usuario("Gabriel"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        
        System.out.println("Terceiro elemento da lista: \n" 
                + lista.get(3) + "\n"); // acessando pelo indice
        
        System.out.println("Remove indice? " + lista.remove(1));
        System.out.println("Remove objeto? " + lista.remove(new Usuario("Manu")));
        
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        System.out.println("Tem? " + lista.contains(u1));
        
        
        
        
        for (Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}

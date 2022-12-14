package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        
        livros.add("O Pequeno Principe");
        livros.push("Minha amiga Genial");
        livros.push("Torto Arado");
        
        System.out.println(livros.peek());
        System.out.println(livros.element());
        
        System.out.println(livros.poll());
        System.out.println(livros.pop());
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        
        System.out.println(livros.isEmpty());
        
        livros.add("O Pequeno Principe 2");
        livros.push("Minha amiga Genial 2");
        livros.push("Torto Arado 2");
        System.out.println(livros.isEmpty());
        for (String livro: livros) {
            System.out.println(livro);
        }
        
    }
}

package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        
        // add e offer adicionam elemento na fila. 
        // Mas diferente comportamento quando fila cheia.
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lanca uma excecao
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        
        //Peek e Element obtem proximo item da fila, sem remover
        //Quando fila vazia, comportam diferente
        System.out.println("fila peek " + fila.peek());// retorna false
        System.out.println("fila peek " + fila.peek());
        System.out.println("fila element " + fila.element()); // lanca uma excecao
        System.out.println("fila elemento " + fila.element());
        
        //Peek e Element obtem proximo item da fila, e remover
        System.out.println("poll 1 " + fila.poll()); // retorna false
        System.out.println("remove " + fila.remove());  // lanca uma excecao
        System.out.println("poll 2 " + fila.poll());
        System.out.println("poll 3 " + fila.poll());
        System.out.println("poll 4 " + fila.poll());
        System.out.println("poll 5 " + fila.poll());
        System.out.println("poll 6 " + fila.poll());
        // System.out.println("remove " + fila.remove());
        
        // fila.size() -> tamanho da lista
        // fila.clear() -> esvaziar lista
        // fila .isEmpty() -> saber se esta vazia
        // fila.contains(...)
        
    }

}

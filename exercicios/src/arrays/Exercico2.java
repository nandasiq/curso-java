package arrays;

import java.util.Arrays;

public class Exercico2 {
    
    public static void main(String[] args) {
        
        double [] notas = new double [4];
        System.out.printf("Array criada, mas nao atribuida: %s\n", Arrays.toString(notas));
        
        notas[0] = 8.2;
        notas[1] = 7.6;
        notas[2] = 9.7;
        notas[3] = 6.9;
        System.out.printf("Array atribuida: %s\n", Arrays.toString(notas));
        
        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        System.out.printf("Media e: %.2f", total/notas.length);
        
    }

}

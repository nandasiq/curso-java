package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {

    // Crie um programa que recebe 10 valores e ao final imprima o maior número. 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dez numeros: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3= entrada.nextInt();
        int n4 = entrada.nextInt();
        int n5 = entrada.nextInt();
        int n6 = entrada.nextInt();
        int n7 = entrada.nextInt();
        int n8 = entrada.nextInt();
        int n9 = entrada.nextInt();
        int n10 = entrada.nextInt();
        
       System.out.println(Math.max(n10,
               Math.max(n9, 
                       Math.max(n8, 
                               Math.max(n7, 
                                       Math.max(n6, 
                                               Math.max(n5, 
                                                       Math.max(n4, 
                                                               Math.max(n3, 
                                                                       Math.max(n1, n2)))))))))); 

        entrada.close();

        
    }
}

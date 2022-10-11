package controle.exercicios;

import java.util.Scanner;

public class Entre0e10Par {
    
    //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par; 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");
        int n = entrada.nextInt();
        
        if (n >= 0 && n <= 10) {
            System.out.println("Esse numero esta entre 0 e 10");
        
            if (n % 2 == 0) {
                System.out.println("Esse numero e par");
            }
        }
        entrada.close();
    }

}

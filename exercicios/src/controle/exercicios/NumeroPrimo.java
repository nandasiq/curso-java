package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

    
    //Criar um programa que receba um número e diga se ele é um número primo. 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer n = entrada.nextInt();
        
        if (n %2 == 0 || n == 2) {
            System.out.println("Esse numero nao e primo");
        } else {
            System.out.println("Numero primo");
        }
        
        
        entrada.close();

    }
}

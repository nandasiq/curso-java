package fundamentos.exercicios;

import java.util.Scanner;

public class AoQuadradroAoCubo {

    // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para elevar ao quadrado: ");
        double quad = entrada.nextDouble();
        quad = Math.pow(quad, 2);
        
        System.out.println("Digite um numero para elevar ou cubo: ");
        double cubo = entrada.nextDouble();
        cubo = Math.pow(cubo, 3);
        
        System.out.printf("o quadrado e: %.2f. O cubo e: %.2f", quad, cubo);
        
        entrada.close();
        
    }
}

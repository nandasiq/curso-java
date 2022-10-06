package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoCelsius {
    
    // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva a temperatura em Celsius: ");
        double c = entrada.nextDouble();
        double f = (c * 9/5) + 32;
        
        System.out.printf("A temperatura em Fahrenheit é: %.2f", f);
        
        entrada.close();
        
    }

}

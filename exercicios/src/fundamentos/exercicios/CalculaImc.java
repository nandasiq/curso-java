package fundamentos.exercicios;

import java.util.Scanner;

public class CalculaImc {
    
    // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();
        
        System.out.println("Digite sua altura em metros: ");
        double altura = entrada.nextDouble();
        
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC e: %.2f", imc);
        
        entrada.close();
        
        
    }

}

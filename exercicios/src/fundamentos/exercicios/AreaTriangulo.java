package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

    // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor da base do triangulo: ");
        double base = entrada.nextDouble();
        
        System.out.println("Digite o valor da altura do triangulo: ");
        double altura = entrada.nextDouble();
        
        double area = base * altura / 2;
        System.out.printf("Area do triangulo e: %.2f", area);
        
        entrada.close();
    }

}

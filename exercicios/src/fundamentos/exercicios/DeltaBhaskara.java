package fundamentos.exercicios;

import java.util.Scanner;

public class DeltaBhaskara {
    
    //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
    //utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
    //Encontre o delta
    
    public static void main(String[] args) {
        
        System.out.println("O delta de Bahskara com a=1 b=12 e c=-13");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de a:");
        double a = entrada.nextDouble();
        System.out.println("Digite o valor de b:");
        double b = entrada.nextDouble();
        System.out.println("Digite o valor de c:");
        double c = entrada.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Delta e igual a: %.2f\n", delta);
        
        double x1 = ( -b + Math.sqrt(delta)) / 2 * a;
        System.out.printf("X1 vale %.2f", x1);
        
        double x2 = ( -b - Math.sqrt(delta) ) / 2 * a;
        System.out.printf("\nX2 vale %.2f", x2);
        
        entrada.close();
    }

}

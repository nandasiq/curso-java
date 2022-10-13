package controle.exercicios;

import java.util.Scanner;

public class SomaPositivos {
    
    //Criar um programa que enquanto estiver recebendo números positivos,
    // imprime no console a soma dos números inseridos, caso receba um
    // número negativo, encerre o programa. Tente utilizar a estrutura do while. 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

       System.out.println("Digite um numero positivo somar. Para sair digite um negativo. ");
       
        int n = entrada.nextInt();
        int soma = 0;
        
        while (n > 0) {
           soma = soma + n;
           System.out.println("Digite outro numero: ");
           n = entrada.nextInt();
        }
        System.out.println("A soma e: " + soma);

        entrada.close();

    }

}

package controle.exercicios;

import java.util.Scanner;

public class Notas {

    //Criar um programa que receba duas notas parciais, calcular a média final. 
    // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
    // se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
    // caso contrário imprime no console "Reprovado". 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Digite sua n1: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite sua n2: ");
        double n2 = entrada.nextDouble();
        
        double media = (n1 + n2) / 2;
        String resultado = "";
        
        if (media >= 7) {
            resultado = "aprovade";
        } else if (media >= 4 && media < 7) {
            resultado = "em recupercao";
        } else if (media < 4){
            resultado = "reprovade";
        } 
        
        System.out.printf("Sua media e: %.2f.\n Voce esta %s", media, resultado);

        entrada.close();

        
    }
    
}

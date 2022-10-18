package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMedia {
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantas notas serao somadas: ");
        int tamanhoArray = entrada.nextInt();
        
        double [] notas = new double [tamanhoArray];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("digite a nota");
            notas[i] = entrada.nextDouble();
        }
        
        System.out.printf("As notas sao: %s\n", Arrays.toString(notas));

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        System.out.printf("Sua media e: %.2f", total/notas.length);
        
        entrada.close();

    }

}

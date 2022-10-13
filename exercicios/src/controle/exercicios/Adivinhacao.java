package controle.exercicios;

import java.util.Scanner;

public class Adivinhacao {
    
    // Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
    // Armazene um numero aleatório em uma variável. O Jogador tem 10 
    // tentativas para adivinhar o número gerado. Ao final de cada tentativa, 
    // imprima a quantidade de tentativas restantes, e imprima se o número 
    // inserido é maior ou menor do que o número armazenado. 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n = 6;
        int numero = 0;
        int tentativa = 10;
        System.out.println("Vc tem 10 tentativas para adivinhar o numero");
        
                        
        while (tentativa > 0) {
            
            System.out.println("digite o numero: ");
            numero = entrada.nextInt();
            tentativa--;
            
            if (numero == n) {
                System.out.println("Parabens");
                tentativa = 0;
                
            } else if (numero != n) {
                System.out.printf("Voce pode errar mais %d vezes.\n", tentativa);
            }
        }
        
        
        
        
        entrada.close();

    }

}

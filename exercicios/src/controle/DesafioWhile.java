package controle;

import java.util.Scanner;

public class DesafioWhile {
    
    public static void main(String[] args) {
        
        // nota de 10 - 0
        // total armazena todas as notas
        // contador de notas validas
        // fazer a media
        // usuario digitar -1 sai
        
        Scanner entrada = new Scanner(System.in);

        //System.out.println("Digite a nota:");
        double nota;
        int quantidadeNota = 0;
        double total =  0;
        
        
        do {
            System.out.println("Digite a nota");
            nota = entrada.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                
                quantidadeNota ++;
                total = total + nota;
                
            } else if (nota < -1 || nota > 10) {
                
              System.out.println("nota invalida, digite novamente");
              nota = entrada.nextDouble();  
            }
            
        } while (nota != -1);
        
        double media = total / quantidadeNota;
        System.out.printf("Sua media e: %.2f", media);
        

        entrada.close();

    }

}

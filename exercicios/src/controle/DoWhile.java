package controle;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palavra = "";

        do {
            System.out.println("Palavras magicas");
            System.out.println("Quer sair?");
            palavra = entrada.nextLine();
            
        } while(!palavra.equalsIgnoreCase("Por favor"));
        
        System.out.println("Obrigada");

        
        entrada.close();

        
    }

}

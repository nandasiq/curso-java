package controle;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("escreva qualquer coisa. Para sair escreva \"sair\"");
        String palavra = entrada.nextLine();
        
        while (!palavra.equalsIgnoreCase("sair")) {
            
            
            System.out.println("escreva outra palavra");
            palavra = entrada.nextLine();
        }
        
        entrada.close();
    }
}

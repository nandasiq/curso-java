package controle;

import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite a media:");
        double media = entrada.nextDouble();
        
        if( media <= 10 && media >= 7.0) {
            System.out.println("Aprovade");
            System.out.println("Parabens!!");
        }
        
        if(media < 7 && media >= 4.5) {
            System.out.println("Recuperacao");
        }
        
        
        boolean reprovacao = media < 4.5 && media > 0;
        if(reprovacao) {
            System.out.println("Reprovade");
        }
        entrada.close();
    }

}

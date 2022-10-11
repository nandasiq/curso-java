package controle;

import java.util.Scanner;

public class DesafioWhileProf {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int quantidadeNotas = 0;
        double nota = 0;
        double total = 0;
        
        while (nota != -1) {
            System.out.println("informe a nota: ");
            nota = entrada.nextDouble();
            
            if (nota <= 10 && nota >= 0) {
                quantidadeNotas ++;
                total += nota;
            } else if (nota != -1){
                System.out.println("Nota invalida");
            }
        }

        double media = total / quantidadeNotas;
        
        System.out.println("media igual: " + media);
        entrada.close();

        
    }

}

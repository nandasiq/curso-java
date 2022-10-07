package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    // Domingo -> 1
    // quarta -> 4
    // sabado -> 7 etc
    // o usuario digita o nome dia da semana e programa retorna o numero
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o dia da semana para saber o numero do dia");
        String dia = entrada.next();
        dia = dia.toLowerCase();
        
        if (dia.equals("domingo")) {
            System.out.println(1);
        } else if (dia.equals("segunda")) {
            System.out.println(2);
        } else if (dia.equals("terca")) {
            System.out.println(3);
        } else if (dia.equals("quarta")){
            System.out.println(4);
        } else if(dia.equals("quinta")) {
            System.out.println(5);
        } else if(dia.equals("sexta")) {
            System.out.println(6);
        } else {
            System.out.println(7);
        }   
        

        
        entrada.close();
        
    }
}

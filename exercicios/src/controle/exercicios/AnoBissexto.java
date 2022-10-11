package controle.exercicios;


import java.time.Year;


public class AnoBissexto {
    
    public static void main(String[] args) {
        int days = Year.of(2022).length();
        
        if (days == 365) {
            System.out.println("Ano nao e bissexto");
        } else {
            System.out.println("Ano bissexto");
        }
    }
}

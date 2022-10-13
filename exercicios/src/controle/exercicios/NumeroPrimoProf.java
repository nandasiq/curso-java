package controle.exercicios;

    import java.util.Scanner;


    public class NumeroPrimoProf {
        /**
         * 4. Criar um programa que receba um número e diga se ele é um número primo.
         */
        public static void main(String[] args) {

            int contadorDeDivisores = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nDigite um numero para verificar se e primo:");
            int numero = scanner.nextInt();

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    contadorDeDivisores++;
                }
            }

            if (contadorDeDivisores == 0) {
                System.out.println("\nO numero " + numero + " e primo.");
            } else {
                System.out.println("\nO numero " + numero + " nao e primo.");
            }

            scanner.close();

        }

    }


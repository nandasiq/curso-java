package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizMinha {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int nAlunos = entrada.nextInt();
        
        System.out.println("Digite o numero de notas: ");
        int nNotas = entrada.nextInt();
        
        double [] [] notasAlunos = new double [nAlunos] [nNotas];
        
        double total = 0;
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1));
            for (int j = 0; j < nNotas; j++) {
                System.out.println("Nota " + (j + 1) + ": ");
                notasAlunos[i][j] = entrada.nextDouble();
                total += notasAlunos[i][j];
            }
            
        }

        System.out.println("A media de notas da turma e: " 
                        + (total / (nAlunos * nNotas)));
        
        for (double [] notaAluno: notasAlunos) {
            
            System.out.println(Arrays.toString(notaAluno));
        }
        
        
        
        entrada.close();

    }

}

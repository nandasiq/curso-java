package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		System.out.print("Amar");
		System.out.print(" vc e bom demais!\n\n");
		
		System.out.println("amar ");
		System.out.println("ao vivo, entao");
		
		System.out.printf("Deputado federal:%d Deputado estadudal:%d "
				+ "Senador:%d Governador:%d Presidente%d\n\n", 1234, 55678, 651, 13, 13);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.",
				nome, sobrenome, idade);
		entrada.close();
	}

}

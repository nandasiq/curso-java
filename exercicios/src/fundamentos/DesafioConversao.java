package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	//usar scanner  pegar 3 strings com nextline
	// receber os ultimos tres salarios e imprimir a media
	// usuario pode usar ponto ou virgula
	
	public static void main(String[] args) {
		
	
		//Digite os ultimos tres salarios
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu ultimo salario: ");
		String salario1 = entrada.nextLine();
		
		System.out.print("Digite seu penultimo salario: ");
		String salario2 = entrada.nextLine();

		System.out.print("Digite seu antepenultimo salario: ");
		String salario3 = entrada.nextLine();
		
		entrada.close();
		
				
		//converta se achar virgula transforme em ponto
		String sal1 = salario1.replace(',', '.');
		String sal2 = salario2.replace(',', '.');
		String sal3 = salario3.replace(',', '.');
		
		
		//converter tudo para double
		Double s1 = Double.parseDouble(sal1);
		Double s2 = Double.parseDouble(sal2);
		Double s3 = Double.parseDouble(sal3);
		
		//System.out.println(s1);
		
		//fazer media
		Double media = (s1 + s2 + s3)/3;
		System.out.println("A media dos seus ultimos salarios e: " + media);
		
	}

}

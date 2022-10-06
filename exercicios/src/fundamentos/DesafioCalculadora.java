package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	// ler num1, num2 e operdor
	public static void main(String[] args) {
		
		System.out.println("Favor inserir numero 1, numero 2 e operador (+ - * / %)");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nnumero 1: ");
		String num1 = entrada.next();
		double n1 = Double.parseDouble(num1);
		//System.out.println(n1);
		
		System.out.println("\nnumero 2: ");
		String num2 = entrada.next();
		double n2 = Double.parseDouble(num2);
		//System.out.println(n2);
		
		
		System.out.println("\noperador: ");
		String operador = entrada.next();
		//System.out.println(operador);
		
		//operador é modulo? então modulo ou "erro"
		String mod = "%".equals(operador) ? Double.toString(n1 % n2) : "Erro de operador";
		//operador é divisão? então divide
		String div = "/".equals(operador) ? Double.toString(n1 / n2) : mod;
		//operador é multiplicação? então multiplica ou
		String mult = "*".equals(operador) ? Double.toString(n1 * n2) : div;
		//operador é subtração? entao subtraia ou 
		String subt = "-".equals(operador) ? Double.toString(n1 - n2) : mult;
		//operador é soma? entao soma ou proximo
		String soma = "+".equals(operador) ? Double.toString(n1 + n2) : subt;
		
		
			
		System.out.println("o valor da solucao: " + soma);
		
		
		
		entrada.close();
	}
	
}

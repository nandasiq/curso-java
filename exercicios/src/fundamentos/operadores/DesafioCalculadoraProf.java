package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadoraProf {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe outro numero: ");		
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe um operador (+-/*%): ");
		String op = entrada.next();
		
		// Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;

		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
		
		
	}
}

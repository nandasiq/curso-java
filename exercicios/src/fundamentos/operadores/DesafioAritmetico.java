package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
	double a = 6 * (3 + 2);
	double b = (1 - 5) * ( 2 - 7 );

	a = a * a;
	b = b / 2;
	
	a = a / (3 * 2);
	b = b * b;
	
	a = a - b;
	
	a = Math.pow(a, 3);
	
	a = a / Math.pow(10, 3) ;
	System.out.println(a);
	
	}
}

package fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
	
		// Trabalho na terca - V e F
		// Trabalho quinta - V e F
		
		boolean trampoter = false;
		boolean trampoqui = false;
		
		
		// tv de 32 se rolar um trabalho
		System.out.println("Vai ter TV de 32\"?");
		System.out.println(trampoter ^ trampoqui);
		// tv de 50 se rolar dois trabalhos
		System.out.println("\nVai ter TV de 50\"?");
		System.out.println(trampoter && trampoqui);
		
		// ir shopping tomar sorvete
		System.out.println("\nVamos tomar sorvete?");
		System.out.println(trampoter || trampoqui);
		
		// ser saudavel
		System.out.println("\nVamos ser saudavel?");
		System.out.println(!trampoter && !trampoqui);
		
		
		
	}

}

package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {

		System.out.println("Lula ladrão, roubou meu coração".charAt(9));
		
		String s = "Vamos votar";
		s = s.toUpperCase();
		System.out.println(s + "!!");
		System.out.println(s.concat("!!"));
		System.out.println(s.startsWith("Vamos"));
		System.out.println(s.startsWith("VAMOS" ));
		System.out.println(s.toLowerCase().endsWith("votar"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("vamos votar"));
		
		
		var nome = "Luana";
		var sobrenome = "Hanh";
		var idade = 33;
		var salario = 12345.09;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
				 + "\nIdade: " + idade + "\nSalario: " + salario +"\n\n");
		
		System.out.printf("A linda %s %s tem %d anos, ganha RS%.2f e vota Lula", nome, sobrenome, idade, salario);
	}

}

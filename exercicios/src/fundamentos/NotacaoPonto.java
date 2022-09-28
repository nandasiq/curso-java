package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Vamos brilhar nesse curso!";
		s = s.toUpperCase();
		s = s.replace("!", ",");
		s = s.concat(" p*rra!");

		System.out.println(s);
		
		String f = "Beta linda".toUpperCase();
		System.out.println(f);
		
		String y = "bora de Lula dia 2"
				.replace("2", "primeiro turno")
				.toUpperCase()
				.concat(" para melhor distribuicao de renda!");
		
		System.out.println(y);
	}

}

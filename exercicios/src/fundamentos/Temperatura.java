package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		double faren = 75;
		double cel;
		
		final double X = 32;
		final double Y = 5/9.0;
		
		cel = (faren - X) * Y;
		
		System.out.println("A temperatura em celsius e " + cel);
		
		// (F -32) * 5/9 = C
		
	}

}

package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.12345;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}

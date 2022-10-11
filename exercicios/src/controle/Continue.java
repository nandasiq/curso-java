package controle;

public class Continue {
    
    public static void main(String[] args) {
        
        // enquanto o break para no caso. o continue
        // apenas pula aquele caso (iteracao)
        
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 1) {
                continue;
            }
            
            System.out.println(i);
        }
        
    }

}

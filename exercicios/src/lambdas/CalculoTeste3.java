package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    
    public static void main(String[] args) {
        
       
        BinaryOperator<Double> soma = (x, y)  -> {
            return x + y;
        };
        System.out.println("Impresso com funcao lambda " + soma.apply(2.0, 3.0));
        
        
        BinaryOperator<Integer> soma2 = (x, y) -> x * y;
        System.out.println("Impresso com lambda reduzida e alterando var soma para Integer " 
        + soma2.apply(3, 3));
        
        
        System.out.println(Calculo.massa());
    }

}

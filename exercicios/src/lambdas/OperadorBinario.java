package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    
    public static void main(String[] args) {
        
        //no binary operator, tanto duas as entradas,
        //quanto o returno tem que ser do mesmo tipo  
        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2)/2;
                
        System.out.println(media.apply(9.8, 5.7));
        
        
        //biFunction vc pode definir os tipos de entrada
        // e o tipo de retorno. E vc precisa definir
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
                double notaFinal = (n1 + n2)/2;
                return notaFinal >= 7 ? "Aprovado" : "Reprovado";
                };
                    
       System.out.println(resultado.apply(9.0, 2.0));
       
       Function<Double, String> conceito = 
               m -> m >= 7 ? "Aprovade" : "Reprovade";
       
        System.out.println(media.andThen(conceito).apply(9.8, 7.5));
               
    }

}

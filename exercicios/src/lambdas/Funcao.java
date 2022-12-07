package lambdas;
import java.util.function.Function;


public class Funcao {

    public static void main(String[] args) {
        
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";
                
        System.out.println(parOuImpar.apply(33));
        
        Function<String, String> oResultadoE = 
                valor -> "O resultado e: " + valor;
                
        Function<String, String> empolgado =
                valor -> valor + "!!";
                
        Function<String, String> duvida =
                 valor -> valor + "??";

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(36);
        
        System.out.println(resultadoFinal);        
        
        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(36);
        
        System.out.println(resultadoFinal1);        
    
    }
}

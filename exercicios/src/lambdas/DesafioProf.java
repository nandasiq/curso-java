package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioProf {

    
    public static void main(String[] args) {
        

        /*
         * 1. Calcule preco com desconto
         * 2. Imposto municipal: se preco >= 2500(8,5%) / < 2500 isento
         * 3. Frete: >= 3000 (100) / 3000 (50)
         * 4. Arredondar: deixar duas casas decimais
         * 5 Formatar com R$
         */

        Function<Produto, Double> precoFinal = 
                prod -> prod.preco * (1 - prod.desconto);
                
        UnaryOperator<Double> imposto = 
                preco -> preco >= 2500 ? (preco * 1.085) : preco; 
        
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? (preco + 100) : (preco + 50);
                
        UnaryOperator<Double> arredondar = 
                preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
                
        Function<Double, String> formatar = 
                preco -> ("R$" + preco).replace(".", ",");
        
        Produto p = new Produto("iPad", 3235.89, 0.13);
        
        String preco = precoFinal
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        
        System.out.println("O preco final e " + preco);
        
        
        
    }
}

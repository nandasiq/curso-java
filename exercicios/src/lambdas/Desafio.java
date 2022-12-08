package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    
    public static void main(String[] args) {
        
        Produto p = new Produto("iPad" , 3235.89, 0.13);
        
        /*
         * 1. Calcule preco com desconto
         * 2. Imposto municipal: se preco >= 2500(8,5%) / < 2500 isento
         * 3. Frete: >= 3000 (100) / 3000 (50)
         * 4. Arredondar: deixar duas casas decimais
         * 5 Formatar com R$
         */
        
        Consumer<Produto> precoComDesconto = 
                prod -> System.out.println(prod.preco * (1 - prod.desconto));
                precoComDesconto.accept(p);        
                
                
        Function<Produto, Double> precoDesconto =
                prod -> prod.preco * (1 - prod.desconto);
                
                System.out.println(precoDesconto.apply(p));
                
        UnaryOperator<Double> precoImposto =
                preco -> {
                    return preco >= 2500 ? (preco * 1.085) : preco;
                };
                
                System.out.println("\n" + precoDesconto
                        .andThen(precoImposto)
                        .apply(p));
                
        UnaryOperator<Double> precoFrete =
                preco -> preco >= 3000 ? (preco + 100) : (preco + 50); 
                
        Consumer<Double> precoFormatado =
                num -> System.out.printf("\nR$%.2f", num);


                    double precoFinal = precoDesconto
                            .andThen(precoImposto)
                            .andThen(precoFrete)
                            .apply(p);
                   

         precoFormatado.accept(precoFinal);
        
    }

}

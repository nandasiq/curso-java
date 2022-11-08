package lambdas;

public class CalculoTeste2 {
    
    public static void main(String[] args) {
        
        //como a implementacao de calculo so tem um metodo, o java
        // entenede e consegue implementar o metodo dessa forma
        // mas tem que ser com os mesmo parametros e os mesmo returns
        Calculo soma = (x, y)  -> {
            return x + y;
        };
        System.out.println("Impresso com funcao lambda " + soma.executar(2, 3));
        
        
        // como soma e uma variavel eu posso mudar
        // e eu posso escrever de forma reduzida quando eu tenho 
        // so uma sentenca de codigo, tirando par de chaves e o return
        soma = (x, y) -> x * y;
        System.out.println("Impresso com lambda reduzida e alterando var soma " 
        + soma.executar(3, 3));
    }

}

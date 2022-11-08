package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");
        
        System.out.println("Forma tradicional:");
        for(String nome: aprovados) {
            System.out.println(nome);
        }
        
        System.out.println("\nLambda 01: ");
        aprovados.forEach((nome) -> {System.out.println(nome + "!!"); });
        
       // forma simplificada. Por nome ser o unico parametro passado, dispensa
       // o uso de parenses. Por ser uma unica sentenca de codigo, 
       // uso de chaves é opcional, e sem a chave, não pode o ; depois da funcao
       // aprovados.forEach(nome -> System.out.println(nome + "!!"));


        // passa referencia para o metodo como parametron para o for each
        // e automaticamente, para cada elemtento da lista foi passado como 
        // parametro para o println do syso
        System.out.println("\nMethod Reference 01: ");
        aprovados.forEach(System.out::println);
        
        System.out.println("\nLambda 02: ");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        System.out.println("\nMethod Reference 02: ");
        aprovados.forEach(Foreach::meuImprimir);
        
    }
    
    static void meuImprimir(String nome) {
        System.out.println("Ola, meu nome e " + nome);
    }
    

}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    
    public static void main(String[] args) {
        
        // apenas para referencia
        Consumer<Object> print = System.out::print;
        
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);
        
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);
        
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);
        
        
        // gerando uma stream infinita sem oredenacao
        //Stream.generate(() -> "a").forEach(print); 
        
        
        // gerando uma stream infinita oredenacao
       //Stream.iterate(0, n -> n + 1).forEach(null);
        
        
    }

}

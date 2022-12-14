package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2); //java transforma esse tipo primitivo em classe primitiva. de double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x'); 
        
        System.out.println("tamanho e " + conjunto.size());
        
        conjunto.add("Teste");
        conjunto.add('X');
        System.out.println("tamanho agora e " + conjunto.size());
        
        System.out.println("teste remover \"teste\": " + conjunto.remove("teste"));
        System.out.println("teste remover \"X\": " + conjunto.remove('X'));
        
        System.out.println("teste contem \"X\": " + conjunto.contains('X'));
        
        
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        System.out.println(nums);
        System.out.println(conjunto);
        
        // conjunto.addAll(nums); // uniao de dois conjuntos
        // conjunto.retainAll(nums); // interseção de dois conjuntos
        conjunto.clear();
        
        System.out.println(conjunto);
        
             
    }
}

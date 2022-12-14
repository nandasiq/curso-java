package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        
        usuarios.put(1, "Fer");
        usuarios.put(2, "Ricardo");
        usuarios.put(30, "Daniel");
        usuarios.put(4, "Manu");

        System.out.println("Tamanho " + usuarios.size());
        System.out.println("Chaves" + usuarios.keySet());
        System.out.println("Valores " + usuarios.values());
        System.out.println("Valor e chave " + usuarios.entrySet());
        System.out.println("Contem na chave? " + usuarios.containsKey(30));
        System.out.println("Contem no valor? " + usuarios.containsValue("Manu"));
        System.out.println("Get pela chave/id " + usuarios.get(30));
        
        System.out.println();
        
        // percorrer chave
        for (int chave: usuarios.keySet()) {
            System.out.println("Imprimir cada chave " + chave);
        }
        
        System.out.println();
        
        // percorrer pelo valor
        for(String valor: usuarios.values()) {
            System.out.println("Imprimir cada valor " + valor);
        }
        System.out.println();
        
        // 
        for (Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print("Imprimi chave e valor " + registro.getKey());
            System.out.println(" -> " + registro.getValue());
        }
    }
}

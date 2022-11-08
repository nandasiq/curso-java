package oo.encapsulamento.casaA;

public class Paulo {
    
    Ana esposa = new Ana(); 

    void testeAcessos() {
        // System.out.println(esposa.segredo); Nao funciona pq segredo e privado
        System.out.println(esposa.facoEmCasa);
        System.out.println(esposa.souEmCasa);
        System.out.println(esposa.todosSabem);
    }

}

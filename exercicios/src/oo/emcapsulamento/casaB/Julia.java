package oo.emcapsulamento.casaB;

import oo.emcapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();
        
        // System.out.println(esposa.segredo); Nao funciona pq segredo e privado
        // System.out.println(sogra.facoEmCasa);
        // System.out.println(sogra.souEmCasa);
        System.out.println(sogra.todosSabem);
    }

}

package oo.emcapsulamento.casaB;

import oo.emcapsulamento.casaA.Ana;

public class Pedro extends Ana{
    
    void testeAcessos() {
        Ana mae = new Ana(); 
        // System.out.println(esposa.segredo); Nao funciona pq segredo e privado
        // System.out.println(mae.facoEmCasa);
        // System.out.println(mae.souEmCasa); Nao funciona pq estou chamando a instancia mae
        System.out.println(souEmCasa);
        System.out.println(mae.todosSabem);
    }


}

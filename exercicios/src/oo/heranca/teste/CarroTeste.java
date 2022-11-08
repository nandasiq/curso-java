package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Fusca;
import oo.heranca.desafio.Troller;

public class CarroTeste {

    public static void main(String[] args) {
        
        Carro fusca = new Fusca();
        
        
        Troller troller = new Troller(200);
        troller.ligarTurbo();
        
        System.out.println(fusca.getVelocidadeAtual());
        System.out.println(troller.getVelocidadeAtual());
        
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();

        troller.acelerar();
        troller.acelerar();
        troller.acelerar();

        System.out.println(fusca.getVelocidadeAtual());
        System.out.println(troller.getVelocidadeAtual());
        
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();

        troller.frear();
        troller.frear();
        troller.frear();
        troller.frear();
        
        System.out.println(fusca);
        System.out.println(troller);
    }
    
}

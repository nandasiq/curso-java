package oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {
        
        Carro fusca = new Fusca();
        
        
        Carro troller = new Troller(200);
        
        System.out.println(fusca.velocidadeAtual);
        System.out.println(troller.velocidadeAtual);
        
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();

        troller.acelerar();
        troller.acelerar();
        troller.acelerar();

        System.out.println(fusca.velocidadeAtual);
        System.out.println(troller.velocidadeAtual);
        
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();

        troller.frear();
        troller.frear();
        troller.frear();
        troller.frear();
        
        System.out.println(fusca.velocidadeAtual);
        System.out.println(troller.velocidadeAtual);
    }
    
}

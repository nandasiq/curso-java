package oo.heranca.desafio;

public class Carro {
    
    int velocidadeAtual = 0;
    
    void frear(){
        if(velocidadeAtual > 0) {
            velocidadeAtual -= 5;
        }
    }
    
    void acelerar(){
        if(velocidadeAtual < 300) {
            velocidadeAtual += 5;
        }

    }
    

}

package oo.heranca.desafio;

public class Carro {
    
    public final int VELOCIDADE_MAXIMA;
    private int velocidadeAtual = 0;
    private int delta = 5;
    
    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    
    public void acelerar(){
        if(getVelocidadeAtual() + getDelta() > VELOCIDADE_MAXIMA) {
            setVelocidadeAtual(VELOCIDADE_MAXIMA);
        } else {
            setVelocidadeAtual(getVelocidadeAtual() + getDelta());
        }
    }
    
    public void frear(){
        if(getVelocidadeAtual() > 0) {
            setVelocidadeAtual(getVelocidadeAtual() - 5);
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public String toString() {
        return "Velocidade atual e: " + velocidadeAtual;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

}

package oo.heranca.desafio;

public class Troller extends Carro implements Esportivo, Luxo{
    
    private boolean ligarTurbo;
    private boolean ligarAr;
    
    public Troller (int x) {
        super(x);
        setDelta(15);
    }
    
    @Override
    public void ligarTurbo() {
        setDelta(35);
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        setDelta(15);
        ligarTurbo = false;
    }
    
    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }
    
    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if(!ligarTurbo && !ligarAr) {
            return 20;
        }
        return 15;
    }
    
//    void acelerar(){
//        super.acelerar();
//        super.acelerar();
//        super.acelerar();
//    }

}

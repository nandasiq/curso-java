package lambdas;

@FunctionalInterface
public interface Calculo {
    
    public abstract double executar(double a, double b);
    // funcoes lambdas so funcionam quando so tem um
    // metodo dentro da interface. Chamada FunctionalInterface

    
    // na verdade tem como ter outro metodo, desde que
    // seja default...
    default String legal() {
        return "legal";
    }
    
    //... ou ainda a funcao static, mas essa so acessada via a interface
    static String massa() {
        return "massa";
    }
}

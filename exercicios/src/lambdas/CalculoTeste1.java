package lambdas;

public class CalculoTeste1 {
    
   public static void main(String[] args) {
       
       Calculo soma = new Soma();
       Calculo multiplica = new Multiplica();
       
       System.out.println("soma normal " + soma.executar(2, 3));
       System.out.println("multiplica normal " + multiplica.executar(2, 3));
       
       Calculo calculo = new Soma();
       System.out.println("Usando polimorfismo " +
       calculo.executar(4, 5));
       
       calculo = new Multiplica();
       System.out.println("Usando polimorfismo " + 
       calculo.executar(4, 5));
       
       
}

}

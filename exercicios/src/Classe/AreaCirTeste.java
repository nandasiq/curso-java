package classe;

public class AreaCirTeste {
    
    public static void main(String[] args) {
        
        AreaCirc a = new AreaCirc(5.6);
        a.raio = 5;
        
        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 100;
        
        
        
        System.out.println(AreaCirc.area(6));
        System.out.println(a1.area());
        System.out.println(AreaCirc.PI);
              
    }

}

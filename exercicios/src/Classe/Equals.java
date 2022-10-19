package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        
        u1.nome = "Fernanda Montenegro";
        u1.email = "femont@email.com";
        
        Usuario u2 = new Usuario();
        
        u2.nome = "Fernanda Montenegro";
        u2.email = "femont@email.com";
        
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        
        System.out.println(u2.equals(new Date()));
        
        
    }

}

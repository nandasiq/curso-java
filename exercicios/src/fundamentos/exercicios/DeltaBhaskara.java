package fundamentos.exercicios;

public class DeltaBhaskara {
    
    //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
    //utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
    //Encontre o delta
    
    public static void main(String[] args) {
        
        System.out.println("Descobrindo delta com a=1 b=12 e c=-13");
        
        double a = 1;
        double b = 12;
        double c = -13;
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println(delta);
    }

}

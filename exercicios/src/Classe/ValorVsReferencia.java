package classe;

public class ValorVsReferencia {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = a; // atribuicao por valor
        
        a++;
        b--;
        
        System.out.printf("Valor de a: %.1f.\nValor de b: %.1f.", a, b);
        
        Data d1 = new Data(1, 6, 2025);
        Data d2 = d1; // atribuicao por referencia
        
        d1.dia = 31;
        d2.mes = 12;
        
        System.out.println("\nData d1: " + d1.obterDataFormatada());

        voltarDataValorPadrao(d1);
        System.out.println(d1.obterData());
        
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    
    static void voltarDataValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    
    static void alterarPrimitivo(int a) {
        a++;
    }
    
    

}

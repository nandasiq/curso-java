package Classe;

public class DataTeste {

    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 29;
        d1.mes = 12;
        d1.ano = 1992;
        
        var d2 = new Data();
        d2.dia = 31;
        d2.mes = 05;
        d2.ano = 1968;
        
        System.out.printf("Data 1 %d/%d/%d."
                + "\nData 2 %d/%d/%d.", d1.dia, d1.mes, d1.ano, 
                d2.dia, d2.mes, d2.ano);
        
        System.out.printf("\n%s.", d2.obterData());
    }
}
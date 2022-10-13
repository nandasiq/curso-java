package Classe;

public class Data {

    int dia;
    int mes;
    int ano;
    
    String obterData (){
        
        String d = String.valueOf(dia);
        String m = String.valueOf(mes);
        String a = String.valueOf(ano);
        
        String dataPadrao = d.concat("/").concat(m).concat("/").concat(a);
        return dataPadrao;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    
    
}

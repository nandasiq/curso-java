package Classe;

public class Data {

    int dia = 1;
    int mes = 1;
    int ano = 1970;
    
    Data (){
    }
    
    Data (int dia1, int mes1, int ano1){
        dia1 = dia;
        mes1 = mes;
        ano1 = ano;
    }
    
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

package classe;

public class Data {

    int dia;
    int mes;
    int ano;
    
    Data (){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    
    Data (int dia1, int mes1, int ano1){
        dia = dia1;
        mes = mes1;
        ano = ano1;
    }
    
    
    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    
    String obterData (){
        
        String d = String.valueOf(dia);
        String m = String.valueOf(mes);
        String a = String.valueOf(ano);
        
        String dataPadrao = d.concat("/").concat(m).concat("/").concat(a);
        return dataPadrao;
    }
    
    
    
}

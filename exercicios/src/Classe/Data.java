package classe;

public class Data {

    int dia;
    int mes;
    int ano;
    
    Data (){
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }
    
    Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    String obterDataFormatada() {
        String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }
    
    // meu jeito de resolver o problema acima.
    String obterData (){
        String d = String.valueOf(dia);
        String m = String.valueOf(mes);
        String a = String.valueOf(ano);
        
        String dataPadrao = d.concat("/").concat(m).concat("/").concat(a);
        return dataPadrao;
    }
    
    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}

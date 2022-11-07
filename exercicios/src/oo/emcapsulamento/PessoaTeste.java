package oo.emcapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jose", "Silveira", 60);
        //p1.idade = -30;
        p1.setIdade(-30);
        System.out.println(p1); // usando o string
        System.out.println(p1.nomeCompleto());
        
    }

}

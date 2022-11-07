package oo.emcapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int novaIdade) {
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        } else {
            System.out.println("Idade invalida.");
        }
    }
    
    public String toString() {
        return "Oi, meu nome e " + getNome() +
                " e tenho " + getIdade() + " anos";
    }
    
    
}

package oo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobrenome;
    
    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String nomeCompleto() {
        return getNome() + " " + getSobrenome();
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

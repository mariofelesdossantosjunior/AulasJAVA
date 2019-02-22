package br.com.mario.aula_14_02_2018.exercicio01;

public class Pessoa {
    private String nome;
    private String CPF;
    private String endereco;

    Pessoa() {
    }

    public Pessoa(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

package br.com.mario.aula_29_05_2019;

public class Aviao {

    private String nome;
    private Integer numero;

    public Aviao(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

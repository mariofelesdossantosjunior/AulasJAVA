package br.com.mario.aula_30_05_2019;

public class Atendente {

    private String nome;
    private FilaDinamicaCircular fila;

    public Atendente(String nome) {
        this.nome = nome;
        this.fila = new FilaDinamicaCircular();
    }

    public FilaDinamicaCircular getFila() {
        return fila;
    }

    public void setFila(FilaDinamicaCircular fila) {
        this.fila = fila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Atendente{" +
                "nome='" + nome + '\'' +
                ", fila=" + fila +
                '}';
    }
}

package br.com.mario.aula_30_05_2019;

import java.time.Duration;
import java.time.Instant;

public class Cliente {

    private String nome;
    private Instant horaChegada;

    public Cliente(String nome) {
        this.nome = nome;
        this.horaChegada = Instant.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instant getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Instant horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Duration tempoNaFila(Instant horaAtendimento) {
        return Duration.between(horaChegada, horaAtendimento);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", horaChegada=" + horaChegada +
                '}';
    }
}



package br.com.mario.aula_21_02_2018.exercicio02;

public class Quadrado {

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getArea() {
        return lado * 2;
    }

    public Double getPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}

package br.com.mario.aula_21_02_2018.exercicio03;

public class Circulo {

    private static final Double PI = 3.1415926;
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getArea() {
        return PI * (raio * raio);
    }

    public Double getPerimetro() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}

package br.com.mario.aula_21_02_2018;

public class Retangulo {
    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double perimetroRetangulo() {
        return altura * largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}

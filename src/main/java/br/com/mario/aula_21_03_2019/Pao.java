package br.com.mario.aula_21_03_2019;

public class Pao extends Produto {

    private Double peso;
    private static Double precoPorKg = 9.90;

    public Pao(Double peso) {
        super("Pão", (double) peso * precoPorKg);
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public static Double getPrecoPorKg() {
        return precoPorKg;
    }

    public static void setPrecoPorKg(Double precoPorKg) {
        Pao.precoPorKg = precoPorKg;
    }
}

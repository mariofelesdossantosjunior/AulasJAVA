package br.com.mario.aula_21_02_2018.exercicio03;

public class Main {

    public static void main(String[] args) {
        Circulo circulo01 = new Circulo(10.0);
        System.out.println("Area: " + circulo01.getArea());
        System.out.println("Perimetro: " + circulo01.getPerimetro());
        System.out.println("Raio: " + circulo01.getRaio());

        Circulo circulo02 = new Circulo(50.0);
        System.out.println("Area: " + circulo02.getArea());
        System.out.println("Perimetro: " + circulo02.getPerimetro());
        System.out.println("Raio: " + circulo02.getRaio());

        Circulo circulo03 = new Circulo(80.0);
        System.out.println("Area: " + circulo03.getArea());
        System.out.println("Perimetro: " + circulo03.getPerimetro());
        System.out.println("Raio: " + circulo03.getRaio());
    }
}

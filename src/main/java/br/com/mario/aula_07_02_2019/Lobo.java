package br.com.mario.aula_07_02_2019;

public class Lobo extends Canino {

    public Lobo() {
        super();
        System.out.println("É um lobo.");
    }

    @Override
    public void fazerRuido() {
        System.out.println("AOUUUUUUUUUUUUU");
    }
}

package br.com.mario.aula_07_02_2019;

public class Cao extends Canino{

    public Cao() {
        super();
        System.out.println("É um cão.");
    }

    @Override
    public void fazerRuido() {
        System.out.println("AOUUUUUUUUUUUUUUUUUUUUUUU");
    }
}

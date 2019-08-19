package br.com.mario.aula_07_02_2019;

public class Cobra extends Animal{

    public Cobra() {
        super();
        System.out.println("É uma cobra.");
    }

    @Override
    public void fazerRuido() {
        System.out.println("GHIIIIIIIISSSSSSSSSS");
    }
}

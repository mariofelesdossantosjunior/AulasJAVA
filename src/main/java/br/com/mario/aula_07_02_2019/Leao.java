package br.com.mario.aula_07_02_2019;

public class Leao extends Felino {

    public Leao() {
        super();
        System.out.println("É um leão.");
    }

    @Override
    public void fazerRuido() {
        if (isAcordado()) {
            System.out.println("WRHOOOOOOOOOOOOOOO");
        } else {
            System.out.println("O Leão está dormindo!");
        }
    }
}

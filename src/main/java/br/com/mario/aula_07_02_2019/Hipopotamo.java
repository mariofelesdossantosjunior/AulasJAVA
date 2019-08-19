package br.com.mario.aula_07_02_2019;

public class Hipopotamo extends Animal{

    public Hipopotamo() {
        super();
        System.out.println("É um hipopotamo");
    }

    private void tomarBanhoDeLama(){
        if(isAcordado()) {
            System.out.println("Hipopotamo tomando banho de lama.");
        }else{
            System.out.println("O hipopotamo não pode tomar banho dormindo.");
        }
    }

    @Override
    public void fazerRuido() {
        System.out.println("CARUZOOOOOOO");
    }
}

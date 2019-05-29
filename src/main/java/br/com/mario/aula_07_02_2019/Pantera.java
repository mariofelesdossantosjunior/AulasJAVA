package br.com.mario.aula_07_02_2019;

public class Pantera extends Felino{

    public Pantera() {
        super();
    }

    private void fazerShow(){
        if(isAcordado()) {
            System.out.println("Pantera fazendo show.");
        }else{
            System.out.println("A pantera não pode fazer show dormindo.");
        }
    }

    @Override
    public void fazerRuido() {
        System.out.println("RORORORORORORORORORO");
    }
}

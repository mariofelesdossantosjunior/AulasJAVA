package br.com.mario.primeira_aula;

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
}

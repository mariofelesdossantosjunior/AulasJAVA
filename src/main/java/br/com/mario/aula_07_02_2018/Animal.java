package br.com.mario.aula_07_02_2018;

public class Animal {
    private boolean acordado;

    Animal() {
        this.acordado = true;
        System.out.println("Nasceu um animal.");
    }

    public void comer(){
        if(acordado){
            System.out.println("O animal está comendo");
        }else{
            System.out.println("O animal não pode comer dormindo.");
        }
    }

    public void dormir(){
        acordado = false;
        System.out.println("O animal está dormindo.");
    }

    public void acordar(){
        acordado = true;
        System.out.println("O animal está acordado.");
    }

    public void mover(){
        if(acordado){
            System.out.println("O animal está se movendo.");
        }else{
            System.out.println("O animal não pode se mover dormindo.");
        }
    }

    public void fazerRuido(){
        if (acordado){
            System.out.println("O animal está fazendo ruido");
        }else{
            System.out.println("O animal está dormindo não pode fazer ruido.");
        }
    }

    public boolean isAcordado() {
        return acordado;
    }
}

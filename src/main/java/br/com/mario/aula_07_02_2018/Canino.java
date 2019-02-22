package br.com.mario.aula_07_02_2018;

class Canino extends Animal {

    Canino() {
        super();
    }

    public void cacar(){
        if(isAcordado()) {
            System.out.println("O canino está caçando.");
        }else{
            System.out.println("O canino não pode caçar dormindo.");
        }
    }
}

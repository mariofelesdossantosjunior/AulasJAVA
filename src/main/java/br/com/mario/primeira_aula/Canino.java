package br.com.mario.primeira_aula;

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

package br.com.mario.primeira_aula;

import br.com.mario.primeira_aula.Animal;
import br.com.mario.primeira_aula.Canino;
import br.com.mario.primeira_aula.Cao;

public class Main {
    public static void main(String[] args) {

        Canino canino = new Canino();
        canino.cacar();

        Animal animal = new Cao();

        //Cast necessario para mudar a hierarquia
        Cao cao = (Cao) animal;
        cao.cacar();

    }
}

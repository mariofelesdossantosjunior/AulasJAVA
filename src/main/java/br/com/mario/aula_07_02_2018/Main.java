package br.com.mario.aula_07_02_2018;

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

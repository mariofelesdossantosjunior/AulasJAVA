package br.com.mario.aula_07_02_2019;

public class Main {
    public static void main(String[] args) {

        Animal hipopotamo = new Hipopotamo();
        //hipopotamo.fazerRuido();

        Leao leao = new Leao();
       // leao.fazerRuido();

        Lobo lobo = new Lobo();
        //lobo.fazerRuido();

        mostrarRuido(leao);
        mostrarRuido(lobo);
        mostrarRuido(hipopotamo);

    }

    private static void mostrarRuido(Animal animal) {
        animal.fazerRuido();
    }
}

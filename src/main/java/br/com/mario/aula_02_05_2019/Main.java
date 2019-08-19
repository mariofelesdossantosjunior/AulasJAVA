package br.com.mario.aula_02_05_2019;

public class Main {

    public static void main(String[] args) {

        //filaCircularStatic();
        filaDinamica();


    }

 /*   private static void filaCircularStatic() {
        Fila<String> fila = new FilaCircularEstatica(5);

        System.out.println(fila);

        fila.inserir("01");
        System.out.println(fila);
        fila.inserir("02");
        fila.inserir("03");
        System.out.println(fila);
        fila.retirar();
        System.out.println(fila);
        fila.inserir("04");
        fila.inserir("05");
        fila.inserir("06");
        System.out.println(fila);
        fila.inserir("07");
        System.out.println(fila);

        while (!fila.estaVazia()) {
            fila.retirar();
            System.out.println(fila);
        }

        System.out.println(fila);
    }*/


    private static void filaDinamica() {
        Fila<String> fila = new FilaDinamica();

        System.out.println(fila);

        try {
            fila.inserir("01");
            System.out.println(fila);
            fila.inserir("02");
            fila.inserir("03");
            System.out.println(fila);
            fila.retirar();
            System.out.println(fila);
            fila.inserir("04");
            fila.inserir("05");
            fila.inserir("06");
            System.out.println(fila);
            fila.inserir("07");
            System.out.println(fila);

            while (!fila.estaVazia()) {
                fila.retirar();
                System.out.println(fila);
            }

            System.out.println(fila);
        } catch (FilaVaziaExption | FilaCheiaExption e) {
            System.err.println(e.getMessage());
        }
    }
}

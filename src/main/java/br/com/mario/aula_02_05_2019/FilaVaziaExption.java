package br.com.mario.aula_02_05_2019;

public class FilaVaziaExption extends Exception {

    public FilaVaziaExption() {
        super("Fila Vazia");
    }

    public FilaVaziaExption(String message) {
        super("Fila vazia: " + message);
    }


}

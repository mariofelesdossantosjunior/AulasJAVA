package br.com.mario.aula_02_05_2019;

public class FilaCheiaExption extends Exception {

    public FilaCheiaExption() {
        super("Fila Cheia");
    }

    public FilaCheiaExption(String message) {
        super("Fila Cheia: " + message);
    }

}

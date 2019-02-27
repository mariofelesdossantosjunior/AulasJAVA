package br.com.mario.aula_20_02_2018.exercicio02;

public class Televisao {
    private int volume;
    private int canal;
    private boolean ligado;

    public Televisao(int volume, int canal) {
        this.volume = 0;
        this.canal = 1;
        this.ligado = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}

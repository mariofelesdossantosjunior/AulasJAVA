package br.com.mario.aula_20_02_2018.exercicio02;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void almentarVolume() {
        televisao.setVolume(televisao.getVolume() + 1);
    }

    public void diminuirVolume() {
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void almentarCanal() {
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void diminuirCanal() {
        televisao.setCanal(televisao.getCanal() - 1);
    }

    public void canalIndicado(int canal) {
        televisao.setCanal(canal);
    }
}

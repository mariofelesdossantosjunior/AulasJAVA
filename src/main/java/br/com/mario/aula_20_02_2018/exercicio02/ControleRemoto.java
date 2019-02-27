package br.com.mario.aula_20_02_2018.exercicio02;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void almentarVolume() {
        if (televisao.isLigado()) {
            televisao.setVolume(televisao.getVolume() + 1);
        } else {
            System.out.println("Não é possivel almentar volume com a televisão desligada");
        }
    }

    public void diminuirVolume() {
        if (televisao.isLigado()) {
            televisao.setVolume(televisao.getVolume() - 1);
        } else {
            System.out.println("Não é possivel diminuir volume com a televisão desligada");
        }
    }

    public void almentarCanal() {
        if (televisao.isLigado()) {
            televisao.setCanal(televisao.getCanal() + 1);
        } else {
            System.out.println("Não é possivel mudar o canal com a televisão desligada");
        }
    }

    public void diminuirCanal() {
        if (televisao.isLigado()) {
            televisao.setCanal(televisao.getCanal() - 1);
        } else {
            System.out.println("Não é possivel mudar o canal com a televisão desligada");
        }

    }

    public void canalIndicado(int canal) {
        if (televisao.isLigado()) {
            televisao.setCanal(canal);
        } else {
            System.out.println("Não é possivel mudar o canal com a televisão desligada");
        }
    }
}

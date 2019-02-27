package br.com.mario.aula_20_02_2018.exercicio02;

public class Main {

    public static void main(String[] args) {
        Televisao televisao = new Televisao(10, 3);
        televisao.setLigado(true);

        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        controleRemoto.almentarVolume();
        controleRemoto.almentarVolume();
        controleRemoto.diminuirVolume();
        System.out.println(televisao.toString());

        televisao.setLigado(false);
        controleRemoto.almentarCanal();
        controleRemoto.diminuirCanal();
        controleRemoto.canalIndicado(7);
        System.out.println(televisao.toString());
    }
}

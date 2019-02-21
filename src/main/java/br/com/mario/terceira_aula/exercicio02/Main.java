package br.com.mario.terceira_aula.exercicio02;

public class Main {

    public static void main(String[] args) {
        Televisao televisao = new Televisao(10,3);
        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        controleRemoto.almentarVolume();
        controleRemoto.almentarVolume();
        controleRemoto.diminuirVolume();
        System.out.println(televisao.toString());

        controleRemoto.almentarCanal();
        controleRemoto.diminuirCanal();
        controleRemoto.canalIndicado(7);
        System.out.println(televisao.toString());
    }
}

package br.com.mario.aula_21_03_2019;

public class Main {

    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        Pao pao = new Pao(0.5);
        Manteiga manteiga = new Manteiga();

        comanda.adquirirProduto(pao);
        comanda.adquirirProduto(manteiga, 5);
        comanda.devolverProduto(manteiga, 2);

        comanda.pagarComanda();


    }
}

package br.com.mario.aula_14_02_2019.exercicio02;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String nome, Double saldo, Double saldoMinimo) {
        super(nome, saldo, saldoMinimo);
    }

    public void isChequeEspecial() {
        if (getSaldo() < 0) {
            System.out.println("O valor excedido é : " + getSaldo());
        }
    }
}


package br.com.mario.aula_14_02_2018.exercicio02;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("======***Conta Corrente***====");
        System.out.println("================================================");
        ContaCorrente contaCorrente = new ContaCorrente("Mario", 1000.0, -100.0);

        contaCorrente.depositar(700.0);
        contaCorrente.sacar(300.0);
        contaCorrente.isChequeEspecial();
        System.out.println("Saldo Atual: " + contaCorrente.getSaldo());

        System.out.println("================================================");
        System.out.println("======***Conta Poupança***====");
        System.out.println("================================================");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Jose da Silva", 2000.0, 50.0, 10);
        System.out.println("Saldo Atual: "+contaPoupanca.getSaldo());
        contaPoupanca.depositar(800.0);
        contaPoupanca.sacar(400.0);
        System.out.println("Rendimentos: "+contaPoupanca.calculaRendimentos());


    }
}

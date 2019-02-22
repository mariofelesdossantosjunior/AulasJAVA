package br.com.mario.aula_14_02_2018.exercicio02;

public class ContaBancaria {

    private Double saldo = 0.0;
    private Double saldoMinimo = 0.0;
    private String nome;

    public ContaBancaria(String nome, Double saldo, Double saldoMinimo) {
        this.nome = nome;
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
    }

    public void sacar(Double valor) {
        if (verificaSaldo(saldo)) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Impossivel sacar o valor maior que seu saldo.");
        }
    }

    private boolean verificaSaldo(Double valor) {
        return valor > saldo - saldoMinimo;
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(Double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                ", saldoMinimo=" + saldoMinimo +
                ", nome='" + nome + '\'' +
                '}';
    }
}

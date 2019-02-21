package br.com.mario.segunda_aula.exercicio02;

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
        if (valor <= this.saldoMinimo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Impossivel sacar o valor maior que o saldo.");
        }
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
    }

    public Double saldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

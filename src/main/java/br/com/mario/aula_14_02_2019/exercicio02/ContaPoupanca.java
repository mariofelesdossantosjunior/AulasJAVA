package br.com.mario.aula_14_02_2019.exercicio02;

public class ContaPoupanca extends ContaBancaria {
    private Integer diaAniversarioMensal;
    private static final Double RENDIMENTO_POUPANCA = 0.68;

    public ContaPoupanca(String nome, Double saldo, Double saldoMinimo, int diaAniversarioMensal) {
        super(nome, saldo, saldoMinimo);
        this.diaAniversarioMensal = diaAniversarioMensal;
    }

    public Integer getDiaAniversarioMensal() {
        return diaAniversarioMensal;
    }

    public Double calculaRendimentos(){
        return getSaldo() + (getSaldo() * RENDIMENTO_POUPANCA);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaAniversarioMensal=" + diaAniversarioMensal +
                '}';
    }
}

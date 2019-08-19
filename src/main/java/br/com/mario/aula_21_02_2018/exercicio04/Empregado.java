package br.com.mario.aula_21_02_2018.exercicio04;

public class Empregado {

    private String nome;
    private Double valorHora;
    private Double qtdHorasTrabalhadas;
    private Double qtdHorasExtras;
    private Double valorTaxaHoraExtra;


    public Empregado(String nome, Double valorHora, Double valorTaxaHoraExtra) {
        this.qtdHorasTrabalhadas = 0.0;
        this.qtdHorasExtras = 0.0;
        this.nome = nome;
        this.valorHora = valorHora;
        this.valorTaxaHoraExtra = valorTaxaHoraExtra;
    }

    public String getNome() {
        return nome;
    }

    public void trabalho(Double horas) {
        this.qtdHorasTrabalhadas += horas;
    }

    public void trabalhoHoraExtra(Double horas) {
        this.qtdHorasExtras += horas;
    }

    public Double salario(){
        return (qtdHorasExtras * valorTaxaHoraExtra) + (qtdHorasTrabalhadas * valorHora);
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Double qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getQtdHorasExtras() {
        return qtdHorasExtras;
    }

    public void setQtdHorasExtras(Double qtdHorasExtras) {
        this.qtdHorasExtras = qtdHorasExtras;
    }

    public Double getValorTaxaHoraExtra() {
        return valorTaxaHoraExtra;
    }

    public void setValorTaxaHoraExtra(Double valorTaxaHoraExtra) {
        this.valorTaxaHoraExtra = valorTaxaHoraExtra;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                ", qtdHorasTrabalhadas=" + qtdHorasTrabalhadas +
                ", qtdHorasExtras=" + qtdHorasExtras +
                ", valorTaxaHoraExtra=" + valorTaxaHoraExtra +
                '}';
    }
}

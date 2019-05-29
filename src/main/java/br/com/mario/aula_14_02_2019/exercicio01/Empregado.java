package br.com.mario.aula_14_02_2019.exercicio01;

public class Empregado extends Pessoa{
    private Double salarioBase;
    private Double impostoDeRenda;

    public Empregado(Double salarioBase, Double impostoDeRenda) {
        super();
        this.salarioBase = salarioBase;
        this.impostoDeRenda = impostoDeRenda;
    }

    public Double salarioReal(){
        return salarioBase - impostoDeRenda;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getImpostoDeRenda() {
        return impostoDeRenda;
    }

    public void setImpostoDeRenda(Double impostoDeRenda) {
        this.impostoDeRenda = impostoDeRenda;
    }
}

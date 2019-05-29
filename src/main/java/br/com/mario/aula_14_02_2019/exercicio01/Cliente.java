package br.com.mario.aula_14_02_2019.exercicio01;

public class Cliente extends Pessoa{
    private Double limiteCredito;
    private Double montanteDivida;

    public Cliente(Double limiteCredito) {
        super();
        this.limiteCredito = limiteCredito;
        this.montanteDivida = 0.0;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Double getMontanteDivida() {
        return montanteDivida;
    }

    public void setMontanteDivida(Double montanteDivida) {
        this.montanteDivida = montanteDivida;
    }

    public Double getSaldo(){
        return limiteCredito - montanteDivida;
    }
}

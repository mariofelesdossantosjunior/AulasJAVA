package br.com.mario.aula_20_02_2018.exercicio01;

public class Motor {
    private double combustivel;
    private int potencia;

    private Motor(Builder builder) {
        this.combustivel = builder.combustivel;
        this.potencia = builder.potencia;
    }

    public static Builder newMotor() {
        return new Builder();
    }

    public static final class Builder {
        private double combustivel;
        private int potencia;

        private Builder() {
        }

        public Motor build() {
            return new Motor(this);
        }

        public Builder combustivel(double combustivel) {
            this.combustivel = combustivel;
            return this;
        }

        public Builder potencia(int potencia) {
            this.potencia = potencia;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                ", combustivel=" + combustivel +
                ", potencia=" + potencia +
                '}';
    }
}

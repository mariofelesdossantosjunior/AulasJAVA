package br.com.mario.terceira_aula.exercicio01;

public class Automovel {
    private Motor motor;
    private Pneu pneu01;
    private Pneu pneu02;
    private Pneu pneu03;
    private Pneu pneu04;
    private String marca;
    private double kmAtual;

    private Automovel(Builder builder) {
        this.motor = builder.motor;
        this.pneu01 = builder.pneu01;
        this.pneu02 = builder.pneu02;
        this.pneu03 = builder.pneu03;
        this.pneu04 = builder.pneu04;
        this.marca = builder.marca;
        this.kmAtual = builder.kmAtual;
    }

    public static Builder newAutomovel() {
        return new Builder();
    }

    public static final class Builder {
        private Motor motor;
        private Pneu pneu01;
        private Pneu pneu02;
        private Pneu pneu03;
        private Pneu pneu04;
        private String marca;
        private double kmAtual;

        private Builder() {
        }

        public Automovel build() {
            return new Automovel(this);
        }

        public Builder motor(Motor motor) {
            this.motor = motor;
            return this;
        }

        public Builder pneu01(Pneu pneu01) {
            this.pneu01 = pneu01;
            return this;
        }

        public Builder pneu02(Pneu pneu02) {
            this.pneu02 = pneu02;
            return this;
        }

        public Builder pneu03(Pneu pneu03) {
            this.pneu03 = pneu03;
            return this;
        }

        public Builder pneu04(Pneu pneu04) {
            this.pneu04 = pneu04;
            return this;
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder kmAtual(double kmAtual) {
            this.kmAtual = kmAtual;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "motor=" + motor +
                ", pneu01=" + pneu01 +
                ", pneu02=" + pneu02 +
                ", pneu03=" + pneu03 +
                ", pneu04=" + pneu04 +
                ", marca='" + marca + '\'' +
                ", kmAtual=" + kmAtual +
                '}';
    }
}

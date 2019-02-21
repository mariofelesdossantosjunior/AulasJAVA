package br.com.mario.terceira_aula.exercicio01;

public class Pneu {
    private String marca;
    private double pressaoAr;

    private Pneu(Builder builder) {
        this.marca = builder.marca;
        this.pressaoAr = builder.pressaoAr;
    }

    public static Builder newPneu() {
        return new Builder();
    }

    public static final class Builder {
        private String marca;
        private double pressaoAr;

        private Builder() {
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder pressaoAr(double pressaoAr) {
            this.pressaoAr = pressaoAr;
            return this;
        }

        public Pneu build() {
            return new Pneu(this);
        }
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "marca='" + marca + '\'' +
                ", pressaoAr=" + pressaoAr +
                '}';
    }
}

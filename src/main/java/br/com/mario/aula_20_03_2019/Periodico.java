package br.com.mario.aula_20_03_2019;

public class Periodico extends Publicacao {

    private String numeroVolume;
    private Double preco;

    public Periodico(String titulo, Integer numeroCatalogo, String numeroVolume, Double preco) {
        super(titulo, numeroCatalogo);
        this.numeroVolume = numeroVolume;
        this.preco = preco;
    }

    public Periodico() {
        super();
        this.numeroVolume = "Sem Volume";
        this.preco = 0.0;
    }

    public String getNumeroVolume() {
        return numeroVolume;
    }

    public void setNumeroVolume(String numeroVolume) {
        this.numeroVolume = numeroVolume;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public void ler() {
        System.out.println("O leitor está lendo o periodico " + getTitulo());
    }

    public Double vender(Double valor) {
        if (valor >= this.preco) {
            Double troco = this.preco - valor;
            System.out.println("Troco da venda: " + troco);
            return troco;
        } else {
            System.out.println("O valor é menor que o preço do livro!");
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "numeroVolume='" + numeroVolume + '\'' +
                ", preco=" + preco +
                '}';
    }
}

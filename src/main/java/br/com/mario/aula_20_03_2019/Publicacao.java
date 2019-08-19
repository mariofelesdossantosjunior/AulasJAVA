package br.com.mario.aula_20_03_2019;

public abstract class Publicacao {
    private String titulo;
    private Integer numeroCatalogo;

    public Publicacao(String titulo, Integer numeroCatalogo) {
        this.titulo = titulo;
        this.numeroCatalogo = numeroCatalogo;
    }

    public Publicacao(){
        this.titulo = "Titulo Default";
        this.numeroCatalogo = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroCatalogo() {
        return numeroCatalogo;
    }

    public void setNumeroCatalogo(Integer numeroCatalogo) {
        this.numeroCatalogo = numeroCatalogo;
    }

    public abstract void ler();

    @Override
    public String toString() {
        return "Publicacao{" +
                "titulo='" + titulo + '\'' +
                ", numeroCatalogo=" + numeroCatalogo +
                '}';
    }
}



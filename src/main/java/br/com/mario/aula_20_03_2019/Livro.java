package br.com.mario.aula_20_03_2019;

public class Livro extends Publicacao {
    private Boolean situacao;

    public Livro(String titulo, Integer numeroCatalogo) {
        super(titulo, numeroCatalogo);
        this.situacao = true;
    }

    public Livro() {
        super();
        this.situacao = true;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public void ler() {
        System.out.println("O leitor esta lendo o livro " + getTitulo());
    }

    public void emprestar() {
        if (this.situacao) {//Se o livro está disponivel
            this.situacao = false;
        } else {
            System.out.println("Este livro já está indisponível");
        }
    }

    public void devolucao() {
        if (!this.situacao) {
            this.situacao = true;
            System.out.println("Devolução do livro realizada com sucesso!");
        } else {
            System.out.println("A devolução não pode ser realizada. O livro já está disponível");
        }
    }

    public boolean estaDisponivel() {
        return this.situacao;
    }
}

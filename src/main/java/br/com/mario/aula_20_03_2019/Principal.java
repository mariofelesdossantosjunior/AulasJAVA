package br.com.mario.aula_20_03_2019;

public class Principal {

    public static void main(String[] args) {

        Publicacao[] publicacaos = new Publicacao[100];

        publicacaos[0] = new Livro("O Reino Encantado", 1);
        publicacaos[1] = new Livro("Java Como Programar", 5);
        publicacaos[2] = new Periodico("V3", 10, "Programação IFPR", 4.0);
        publicacaos[3] = new Livro("Kotlin Android Developer", 60);
        publicacaos[4] = new Periodico("V2", 5, "UTFR Filosofia", 6.50);

        for (Publicacao publicacao : publicacaos) {

            if (publicacao != null) {
                System.out.println("Numero Catalogo: " + publicacao.getNumeroCatalogo());
                System.out.println("Titulo: " + publicacao.getTitulo());

                publicacao.ler();
                System.out.println("====================================\n");

                if (publicacao instanceof Livro) {
                    Livro livro = (Livro) publicacao;

                    System.out.println("Está disponivel: " + livro.estaDisponivel());
                    livro.emprestar();
                    System.out.println("Está disponivel: " + livro.estaDisponivel());
                    livro.devolucao();
                    System.out.println("Está disponivel: " + livro.estaDisponivel());
                    System.out.println("====================================\n");

                } else {

                    Periodico periodico = (Periodico) publicacao;
                    System.out.println("Preço periodico: " + periodico.getPreco());
                    System.out.println("Vender: " + periodico.vender(2.0));
                    System.out.println("Vender: " + periodico.vender(5.0));
                    System.out.println("Vender: " + periodico.vender(150.0));
                    System.out.println("====================================\n");
                }
            }
        }
    }
}

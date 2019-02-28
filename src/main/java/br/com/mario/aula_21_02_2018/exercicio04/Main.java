package br.com.mario.aula_21_02_2018.exercicio04;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("AFA Sistemas");

        Empregado mario = new Empregado("Mario", 100.0, 150.0);
        mario.trabalho(100.0);
        mario.trabalhoHoraExtra(50.0);
        empresa.contratarEmpregado(mario);

        Empregado vinicius = new Empregado("Vinicius", 200.0, 300.0);
        vinicius.trabalho(50.0);
        vinicius.trabalhoHoraExtra(10.0);
        empresa.contratarEmpregado(vinicius);
        empresa.demiteEmpregado(vinicius);

        System.out.println("A empresa: "+empresa.getNome()+"Possui um Pagamento Mensal de:");
        empresa.pagamentoMensal();
    }
}

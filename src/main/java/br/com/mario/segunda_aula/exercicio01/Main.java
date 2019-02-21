package br.com.mario.segunda_aula.exercicio01;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Cliente cliente = new Cliente(1000.0);
        Empregado empregado = new Empregado(3000.0, 100.0);

        pessoa.setCPF("00000000000");
        pessoa.setNome("Jose da Silva");
        pessoa.setEndereco("Rua A");

        empregado.setCPF("1111111111111111");
        System.out.println("Empregado");
        System.out.println("Salario Base: " + empregado.getSalarioBase());
        System.out.println("Imposto Renda: " + empregado.getImpostoDeRenda());
        System.out.println("Salario Real: " + empregado.salarioReal());


        cliente.setCPF("333333333333333");
        cliente.setNome("Cliente");
        System.out.println("Limite de Credito" + cliente.getLimiteCredito());
        System.out.println("Montante: " + cliente.getMontanteDivida());
        System.out.println("Saldo: " + cliente.getSaldo());

    }
}

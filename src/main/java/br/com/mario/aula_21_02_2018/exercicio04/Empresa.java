package br.com.mario.aula_21_02_2018.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void contratarEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public void demiteEmpregado(Empregado empregado) {
        this.empregados.remove(empregado);
    }

    public void pagamentoMensal() {
        empregados.forEach(empregado -> {
            System.out.println("*******************************");
            System.out.println("Nome: " + empregado.getNome());
            System.out.println("Salario: " + empregado.salario());
        });

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", empregados=" + empregados +
                '}';
    }
}

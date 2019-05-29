package br.com.mario.aula_14_04_2019;

import javax.swing.*;

public class Exercicio01 {

    public static void main(String[] args) {
        FabricaLampada fabricalampada = new FabricaLampada();

        String modeloLampada = JOptionPane.showInputDialog("Qual lampada você deseja criar: \n " +
                "0 - Inclandecente \n" +
                "1 - Fluorecente");

        if (modeloLampada.equals(Tipo.INCLANDESCENTE.getCodigo().toString())) {

            Lampada inclandecente = fabricalampada.construir(Tipo.INCLANDESCENTE);
            inclandecente.ligar();
            inclandecente.desligar();

        } else if (modeloLampada.equals(Tipo.FLUORESCENTE.getCodigo().toString())) {

            Lampada fluorescente = fabricalampada.construir(Tipo.FLUORESCENTE);
            fluorescente.ligar();
            fluorescente.desligar();

        }else{
            System.out.println("Modelo não encontrado!");
        }

    }
}

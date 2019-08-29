package br.com.mario.aula_22_08_2019;

import javax.swing.*;
import java.awt.*;

public class TesteGridLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo GridLayout");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().setLayout(new GridLayout(2,3));

        JButton bt01 = new JButton("01");
        JButton bt02 = new JButton("02");
        JButton bt03 = new JButton("03");
        JButton bt04 = new JButton("04");
        JButton bt05 = new JButton("05");

        frame.add(bt01);
        frame.add(bt02);
        frame.add(bt03);
        frame.add(bt04);
        frame.add(bt05);

        frame.setVisible(true);


    }
}

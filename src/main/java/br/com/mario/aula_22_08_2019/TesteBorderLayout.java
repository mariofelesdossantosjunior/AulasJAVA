package br.com.mario.aula_22_08_2019;

import javax.swing.*;
import java.awt.*;

public class TesteBorderLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo BorderLayout");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().setLayout(new BorderLayout());

        JButton bt01 = new JButton("01");
        JButton bt02 = new JButton("02");
        JButton bt03 = new JButton("03");
        JButton bt04 = new JButton("04");
        JButton bt05 = new JButton("05");

        frame.add(bt01, BorderLayout.NORTH);
        frame.add(bt02, BorderLayout.CENTER);
        frame.add(bt03, BorderLayout.SOUTH);
        frame.add(bt04, BorderLayout.WEST);
        frame.add(bt05, BorderLayout.EAST);

        frame.setVisible(true);


    }
}

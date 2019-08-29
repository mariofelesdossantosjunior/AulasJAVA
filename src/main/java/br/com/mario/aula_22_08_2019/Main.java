package br.com.mario.aula_22_08_2019;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Aula");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().setLayout(new FlowLayout());

        JPanel painelNome = new JPanel();
        JLabel lblNome = new JLabel("Nome");
        JTextField tfNome = new JTextField(15);
        tfNome.setColumns(15);
        painelNome.add(lblNome);
        painelNome.add(tfNome);

        JPanel painelEndereco = new JPanel();
        JLabel lblEndereco = new JLabel("Endereço");
        JTextField tfEndereco = new JTextField(15);
        painelEndereco.add(lblEndereco);
        painelEndereco.add(tfEndereco);

        String [] cidades = {"Umuarama","Nova Olimpia","Cruzeiro do Oeste"};
        JPanel painelCidade = new JPanel();
        JLabel jLlCidadel = new JLabel("Cidade");
        JComboBox<String> cbCidades = new JComboBox<>(cidades);
        painelCidade.add(jLlCidadel);
        painelCidade.add(cbCidades);

        frame.add(painelNome);
        frame.add(painelEndereco);
        frame.add(painelCidade);

        frame.add(new JButton("Cancelar"));
        frame.add(new JButton("Salvar"));

        frame.setVisible(true);

    }
}

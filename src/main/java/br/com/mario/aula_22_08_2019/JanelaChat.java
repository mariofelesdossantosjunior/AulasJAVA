package br.com.mario.aula_22_08_2019;

import javax.swing.*;
import java.awt.*;

public class JanelaChat  extends JFrame {

    public JanelaChat(){
        iniciarComponetes();
    }

    private void iniciarComponetes() {
        setTitle("Chat Frame");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400,500);
        getContentPane().setLayout(new BorderLayout());

        JMenuBar barraMenu = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        barraMenu.add(menuFile);

        JMenu menuHelp = new JMenu("Help");
        barraMenu.add(menuHelp);

        JMenuItem itemMenuOpen = new JMenuItem("Open");
        JMenuItem itemMenuSave = new JMenuItem("Save as");

        setJMenuBar(barraMenu);
    }

    public static void main(String[] args) {
        JanelaChat janelaChat = new JanelaChat();
        janelaChat.setVisible(true);
    }
}

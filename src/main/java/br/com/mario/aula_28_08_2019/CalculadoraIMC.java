package br.com.mario.aula_28_08_2019;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class CalculadoraIMC extends JFrame {

    private JFormattedTextField tfPeso;
    private JFormattedTextField tfAltura;
    private JTextArea taAreaResultado;

    public CalculadoraIMC() throws ParseException {
        iniciarComponetes();
    }

    private void iniciarComponetes() throws ParseException {
        this.setTitle("Calculadora IMC");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(300, 350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new FlowLayout());

        JPanel jpPeso = new JPanel();
        JLabel lblPeso = new JLabel("Peso:");
        tfPeso = new JFormattedTextField();
        tfPeso.setColumns(21);

        MaskFormatter mfPeso = new MaskFormatter("###,##");
        mfPeso.setPlaceholderCharacter('_');
        mfPeso.install(tfPeso);

        jpPeso.add(lblPeso);
        jpPeso.add(tfPeso);

        JPanel jpAltura = new JPanel();
        JLabel lblAltura = new JLabel("Altura:");
        tfAltura = new JFormattedTextField();
        tfAltura.setColumns(20);

        MaskFormatter mfAltura = new MaskFormatter("#,##");
        mfAltura.setPlaceholderCharacter('_');
        mfAltura.install(tfAltura);

        jpAltura.add(lblAltura);
        jpAltura.add(tfAltura);

        JPanel jpBotoes = new JPanel();
        JButton btLimpar = new JButton("Limpar");
        btLimpar.setPreferredSize(new Dimension(130, 25));
        btLimpar.setBackground(Color.RED);
        btLimpar.setForeground(Color.WHITE);
        btLimpar.addActionListener(e -> limpar());

        JButton btCalcular = new JButton("Calcular");
        btCalcular.setPreferredSize(new Dimension(130, 25));
        btCalcular.setBackground(Color.BLUE);
        btCalcular.setForeground(Color.WHITE);
        btCalcular.addActionListener(e -> calcular());

        jpBotoes.add(btLimpar);
        jpBotoes.add(btCalcular);

        JPanel jpResultado = new JPanel();
        jpResultado.setPreferredSize(new Dimension(280, 30));
        jpResultado.setLayout(new BorderLayout());
        jpResultado.add(new Label("Resultado"), BorderLayout.WEST);

        JPanel jpArea = new JPanel();
        taAreaResultado = new JTextArea();
        taAreaResultado.setPreferredSize(new Dimension(280, 150));
        taAreaResultado.setFont(new Font(taAreaResultado.getFont().getName(), taAreaResultado.getFont().getStyle(), 30));
        taAreaResultado.setEditable(false);
        jpArea.add(taAreaResultado);

        this.add(jpPeso);
        this.add(jpAltura);
        this.add(jpBotoes);
        this.add(jpResultado);
        this.add(jpArea);

    }

    private void calcular() {
        String pesoText = removeMask(tfPeso);
        String alturaText = removeMask(tfAltura);

        if(!pesoText.isEmpty() && !alturaText.isEmpty()) {

            double peso = Double.parseDouble(tfPeso.getText().replaceAll(",", "."));
            double altura = Double.parseDouble(tfAltura.getText().replaceAll(",", "."));

            double resultado = peso / (altura * altura);
            taAreaResultado.setText(String.format("%.2f", resultado));
        }else{
            JOptionPane.showMessageDialog(this, "Preencha os valores!", "Calculadora IMC", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String removeMask(JFormattedTextField campo) {
        return campo.getText().replaceAll("\\D","");
    }

    private void limpar() {
        tfPeso.setText("");
        tfAltura.setText("");
        taAreaResultado.setText("0,00");
    }

    public static void main(String[] args) {
        try {
            new CalculadoraIMC().setVisible(true);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

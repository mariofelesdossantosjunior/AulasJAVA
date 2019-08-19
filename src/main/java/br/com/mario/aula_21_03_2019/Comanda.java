package br.com.mario.aula_21_03_2019;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;

public class Comanda {

    private DecimalFormat formatador = new DecimalFormat("R$ #,## 0.00");
    private Produto[] produtos;
    private double valorTotal;
    private int ind;

    public Comanda() {
        this.produtos = new Produto[100];
        this.valorTotal = 0.0;
        this.ind = 0;
    }

    public void adquirirProduto(Produto produto) {
        if (ind <= 100) {
            produtos[ind] = produto;
            ind++;
            valorTotal += produto.getPreco();
        } else {
            System.out.println("A comanda já está cheia!");
        }
    }

    public void adquirirProduto(Produto produto, Integer quantidade) {
        if (ind <= 100) {
            produtos[ind] = produto;
            ind++;
            valorTotal += produto.getPreco() * quantidade;
        } else {
            System.out.println("A comanda já está cheia!");
        }
    }

    public void pagarComanda() {
        System.out.println("Valor pago é :" + formatador.format(valorTotal));
    }

    public void devolverProduto(Produto produto) {
        this.valorTotal -= produto.getPreco();
    }

    public void devolverProduto(Produto produto, Integer quantidade) {
        this.valorTotal -= produto.getPreco() * quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}

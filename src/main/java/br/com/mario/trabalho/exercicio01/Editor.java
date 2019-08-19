package br.com.mario.trabalho.exercicio01;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Stack;

/**
 * @author mario
 */
public class Editor extends Stack<Object> {

    public void limpar() {
        while (this.elementCount != 0) {
            this.pop();
        }
    }

    @Override
    public synchronized String toString() {
        String saida = "";
        for (Object obj : this) {
            char c = (char) obj;
            saida += c;
        }
        return saida;
    }


}

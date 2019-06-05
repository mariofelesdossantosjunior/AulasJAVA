package br.com.mario.aula_30_05_2019;

import br.com.mario.aula_02_05_2019.FilaVaziaExption;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Simulador {

    private static final Atendente atendente01 = new Atendente("Atendente 01");
    private static final Atendente atendente02 = new Atendente("Atendente 02");
    private static final Atendente atendente03 = new Atendente("Atendente 03");
    private static final Atendente atendente04 = new Atendente("Atendente 04");

    public static void main(String[] args) throws InterruptedException, FilaVaziaExption {

        gerarClientes();
        showFilas();
        //TimeUnit.MINUTES.sleep(1);
        gerarClientes();
        showFilas();
        //TimeUnit.MINUTES.sleep(1);
        gerarClientes();
        showFilas();
        //TimeUnit.MINUTES.sleep(1);

        TimeUnit.SECONDS.sleep(30);
        atenderCliente(atendente01);
        TimeUnit.SECONDS.sleep(180);
        atenderCliente(atendente02);
        TimeUnit.SECONDS.sleep(200);
        atenderCliente(atendente03);
        TimeUnit.SECONDS.sleep(340);
        atenderCliente(atendente04);
        TimeUnit.SECONDS.sleep(500);
        atenderCliente(atendente01);

    }

    /**
     * Função responsavel por executar a ação de atendimento
     *
     */
    private static void atenderCliente(Atendente atendente) throws FilaVaziaExption {
        Cliente cliente = (Cliente) atendente.getFila().retirar();
        System.out.println("============================================");
        System.out.println("Cliente atendido: " + cliente.getNome());
        System.out.println("Tempo na fila: " + cliente.tempoNaFila(Instant.now()).getSeconds() + " segundos.");

    }

    private static void gerarClientes() {
        int numeroDeCliente = random(3, 11);
        System.out.println("Numero cliente: " + numeroDeCliente);

        for (int i = 1; i < numeroDeCliente; i++) {
            Cliente cliente = new Cliente("Cliente: " + i);

            Atendente atendente = atendenteMenorFila();
            atendente.getFila().inserir(cliente);
        }
    }

    private static Atendente atendenteMenorFila() {
        List<Atendente> atendentes = Arrays.asList(atendente01, atendente02, atendente03, atendente04);
        Atendente menorFila = atendente01;

        for (Atendente atendente : atendentes) {
            if (atendente.getFila().tamanho() < menorFila.getFila().tamanho()) {
                menorFila = atendente;
            }
        }

        return menorFila;
    }

    private static int random(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    private static void showFilas() {
        System.out.println("=======================================");
        System.out.println(atendente01.getFila().toString());
        System.out.println(atendente02.getFila().toString());
        System.out.println(atendente03.getFila().toString());
        System.out.println(atendente04.getFila().toString());
    }
}

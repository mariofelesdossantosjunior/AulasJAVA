package br.com.mario.aula_27_03_2019;

public class Bicycle implements CarbonFootprint {

    private int qtdPneus;
    private int qtdPassageiros;

    public Bicycle() {
        this.qtdPneus = 2;
        this.qtdPassageiros = 1;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println("Parabéns! O uso de bicicletas não gera emissão de CO2");
    }

    public int getQtdPneus() {
        return qtdPneus;
    }

    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "qtdPneus=" + qtdPneus +
                ", qtdPassageiros=" + qtdPassageiros +
                '}';
    }
}

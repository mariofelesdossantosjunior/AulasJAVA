package br.com.mario.aula_27_03_2019;

public class Car implements CarbonFootprint {
    private double potencia;
    private String combustivel;
    private String modelo;
    private String marca;
    private double mediaKmMensal;

    public Car() {
        this.potencia = 500.0;
        this.combustivel = "Gasolina";
        this.marca = "VW";
        this.modelo = "Jetta";
        this.mediaKmMensal = 0;
    }

    public Car(double potencia, String combustivel, String modelo, String marca, double mediaKmMensal) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.modelo = modelo;
        this.marca = marca;
        this.mediaKmMensal = mediaKmMensal;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println("Sua queima de de CO2 é " + (this.mediaKmMensal * 2.80));
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMediaKmMensal() {
        return mediaKmMensal;
    }

    public void setMediaKmMensal(double mediaKmMensal) {
        this.mediaKmMensal = mediaKmMensal;
    }

    @Override
    public String toString() {
        return "Car{" +
                "potencia=" + potencia +
                ", combustivel='" + combustivel + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

package br.com.mario.aula_27_03_2019;

public class Building implements CarbonFootprint {
    private double metroQuadrados;

    public Building(double metroQuadrados) {
        this.metroQuadrados = metroQuadrados;
    }

    public double getMetroQuadrados() {
        return metroQuadrados;
    }

    public void setMetroQuadrados(double metroQuadrados) {
        this.metroQuadrados = metroQuadrados;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println("Sua construção queima: " + (this.metroQuadrados * 2.30) + " de CO2");
    }

    @Override
    public String toString() {
        return "Building{" +
                "metroQuadrados=" + metroQuadrados +
                '}';
    }
}

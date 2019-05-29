package br.com.mario.aula_27_03_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<CarbonFootprint> lista = new ArrayList<>();

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.toString());

        Car car = new Car();
        System.out.println(car.toString());

        Building building = new Building(70);
        System.out.println(building.toString());


        lista.add(bicycle);
        lista.add(car);
        lista.add(building);

        /**
         * Java 7
         */
      /*  for (int x = 0; x < lista.size(); x++) {
            lista.get(x).getCarbonFootprint();
        }

        *//**
         * Java 7
         *//*
        for (CarbonFootprint item : lista) {
            item.getCarbonFootprint();
        }*/


        List<Produto> produtos = Arrays.asList(
                new Produto(3.2, "COCA"),
                new Produto(5.5, "PASTEL 01"),
                new Produto(5.5, "PASTEL 02"),
                new Produto(6.4, "BOLO"));

        double somaPasteis = produtos.stream()
                .filter(produto -> produto.getNome().contains("PASTEL"))
                .mapToDouble(Produto::getPreco)
                .sum();



        System.out.println("A soma é :" + somaPasteis);


        /*lista.forEach();


        lista.stream()
                .map()
                .
               *//* .forEach(item -> {
            item.getCarbonFootprint();
            System.out.println(item.toString());
        });*//*

        lista.forEach(CarbonFootprint::getCarbonFootprint);*/

    }
}

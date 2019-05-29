package br.com.mario.aula_14_04_2019;

class FabricaLampada {

    Lampada construir(Tipo tipo) {

        if (tipo.equals(Tipo.FLUORESCENTE)) {
            return new Fluorescente();
        } else if (tipo.equals(Tipo.INCLANDESCENTE)) {
            return new Inclandescente();
        } else {
            return null;
        }
    }

    static class Inclandescente implements Lampada {

        @Override
        public void ligar() {
            System.out.println("Ligando a lampada INCLANDESCENTE!");
        }

        @Override
        public void desligar() {
            System.out.println("Desligando a lampada inclandescente!");
        }
    }

    static class Fluorescente implements Lampada {

        @Override
        public void ligar() {
            System.out.println("Ligando a lampada FLUORESCENTE!");
        }

        @Override
        public void desligar() {
            System.out.println("Desligando a lampada FLUORESCENTE!");
        }
    }
}

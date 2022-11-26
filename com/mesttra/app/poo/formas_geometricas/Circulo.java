package com.mesttra.app.poo.formas_geometricas;

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }
}

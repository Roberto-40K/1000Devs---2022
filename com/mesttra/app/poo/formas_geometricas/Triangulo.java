package com.mesttra.app.poo.formas_geometricas;

public class Triangulo implements FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }
}

package com.mesttra.app.poo.formas_geometricas;

public class Quadrado implements FormaGeometrica{

    private double comprimento;
    private double largura;


    public Quadrado(double comprimento, double largura) {
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calculaArea() {
        return this.getComprimento() * this.getLargura();
    }
}

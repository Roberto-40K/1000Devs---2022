package com.mesttra.app.poo.estacionamento;

public class Carro {

    private String placa;
    private String cor;
    private String marca;
    private String modelo;


    public Carro(String placa, String cor, String marca, String modelo) {

        this.setPlaca(placa);
        this.setCor(cor);
        this.setMarca(marca);
        this.setModelo(modelo);

    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
    }

}

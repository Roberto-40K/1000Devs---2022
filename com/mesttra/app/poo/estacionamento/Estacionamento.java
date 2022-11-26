package com.mesttra.app.poo.estacionamento;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {

    private double valorEmCaixa;
    private int capacidadeMaxima;
    private Map<String, com.mesttra.app.poo.estacionamento.Carro> carrosEstacionados;

    public Estacionamento(double valorEmCaixa, int capacidadeMaxima) {

        this.setValorEmCaixa(valorEmCaixa);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setCarrosEstacionados(new HashMap<>());

    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Map<String, com.mesttra.app.poo.estacionamento.Carro> getCarrosEstacionados() {
        return carrosEstacionados;
    }

    public void setCarrosEstacionados(Map<String, com.mesttra.app.poo.estacionamento.Carro> carrosEstacionados) {
        this.carrosEstacionados = carrosEstacionados;
    }

    public boolean registraEntrada(Carro carro) {
        if (this.getCarrosEstacionados().size() < this.getCapacidadeMaxima()) {
            this.getCarrosEstacionados().put(carro.getPlaca(), carro);
            return true;
        }
        return false;
    }

    public boolean registraSaida(String placa, double valorEstadia) {
        if (this.getCarrosEstacionados().remove(placa) != null) {
            this.valorEmCaixa += valorEstadia;
            return true;
        }
        return false;
    }

    public void imprimirSaldo() {
        System.out.println("O SALDO ATUAL É: R$" + this.getValorEmCaixa());
    }

    public void carroPresente(String placa) {
        if (this.getCarrosEstacionados().get(placa) != null) {
            System.out.println("O carro está presente!");
        }
        System.out.println("O carro não foi encontrado no estacionamento!");
    }

    public void carrosNoEstacionamento() {
        for (Carro carro : this.getCarrosEstacionados().values()) {
            System.out.println(carro);
        }
    }
}

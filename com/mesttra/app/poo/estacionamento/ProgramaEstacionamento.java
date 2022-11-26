package com.mesttra.app.poo.estacionamento;

public class ProgramaEstacionamento {

    public static void main(String[] args) {

        Estacionamento estacionamentoRoberto = new Estacionamento(0,50);

        Carro mustang = new Carro("YY-9T", "Preto", "Ford", "Mustang");
        Carro camaro = new Carro("PJ-23K", "Amarelo", "GM", "Camaro");
        Carro civic = new Carro("LLE-223", "Azul Petróleo", "Honda", "Civic");

        estacionamentoRoberto.registraEntrada(mustang);

        estacionamentoRoberto.registraEntrada(camaro);

        estacionamentoRoberto.registraEntrada(civic);

        estacionamentoRoberto.registraEntrada(mustang);

        estacionamentoRoberto.registraEntrada(mustang);

        estacionamentoRoberto.registraEntrada(mustang);

        estacionamentoRoberto.registraEntrada(camaro);

        estacionamentoRoberto.registraEntrada(civic);

        estacionamentoRoberto.registraEntrada(civic);

        estacionamentoRoberto.registraEntrada(camaro);

        estacionamentoRoberto.carrosNoEstacionamento();

        estacionamentoRoberto.carroPresente(camaro.getPlaca());
        estacionamentoRoberto.carroPresente("YY-9T");

        estacionamentoRoberto.imprimirSaldo();

        estacionamentoRoberto.registraSaida(mustang.getPlaca(), 80.00);

        estacionamentoRoberto.imprimirSaldo();
        estacionamentoRoberto.carroPresente(civic.getPlaca());

    }
}

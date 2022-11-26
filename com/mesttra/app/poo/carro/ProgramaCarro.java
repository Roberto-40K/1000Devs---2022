package com.mesttra.app.poo.carro;

public class ProgramaCarro {
    public static void main(String[] args) {

        Carro polo = new Carro("Polo", 1444.4, "VW",  "Preto", 83000);
        System.out.println("PREÇO: " + polo.getValor());
        System.out.println("COR: " + polo.getCor());

        polo.pintar("branco");
        polo.darDesconto(5000);

        System.out.println("PREÇO: " + polo.getValor());
        System.out.println("COR: " + polo.getCor());

        polo.darDesconto(80000);
        System.out.println("PREÇO: " + polo.getValor());
    }
}

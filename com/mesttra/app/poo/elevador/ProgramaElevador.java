package com.mesttra.app.poo.elevador;

public class ProgramaElevador {
    public static void main(String[] args) {

        Elevador B1 = new Elevador(25, 50, 15, 5);
        System.out.println();
        if (B1.getAndar() != 0) {
            System.out.println("O ELEVADOR ESTÁ NO " + B1.getAndar() + ".°" + " ANDAR");
        } else {
            System.out.println("O ELEVADOR ESTÁ NO TÉRREO");
        }
        System.out.println("CAPACIDADE DO ELEVADOR: " + B1.getCapacidade() + " PESSOAS");
        System.out.println("QUANTIDADE DE PESSOAS PRESENTES: " + B1.getQtdePessoasPresentes());

        System.out.println();

        B1.status();
        System.out.println();
        B1.Entra();
        B1.status();
        B1.Sobe(35);
        System.out.println();
        B1.status();
        B1.Sai();
        System.out.println();
        B1.status();
        B1.Desce(10);
        System.out.println();
        B1.status();
    }
}

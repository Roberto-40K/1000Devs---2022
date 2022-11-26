package com.mesttra.app.poo.conta_bancaria;

public class ProgramaContaBancaria {
    public static void main(String[] args) {

        ContaBancaria itau = new ContaBancaria(3392, 10500, "José Almeida");
        System.out.println();
        System.out.println("*****CONTA BANCÁRIA*****");
        System.out.println();
        System.out.println("NOME DO CORRENTISTA: " + itau.getNomeCorrentista());
        System.out.printf("SALDO: R$%.2f%n", itau.getSaldo());

        itau.setsaque(5550);
        itau.setdeposito(2000);

        System.out.println();

        itau.extrato();

    }
}

package com.mesttra.app.poo.conta_bancaria;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String nomeCorrentista;

    public ContaBancaria(int numeroConta, double saldo, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista() {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public void setsaque(double valorSaque) {
        // n�o deixar o saldo ser zerado por um saque
        if (valorSaque >= saldo) {
            System.out.println("ATEN��O! O SALDO N�O PODE SER ZERADO");
        } else {
            System.out.println("SAQUE REALIZADO COM SUCESSO");
            System.out.printf("VALOR DO SAQUE: R$%.2f%n", valorSaque);
            this.saldo -= valorSaque;
        }
    }

    public void setdeposito(double valorDepositado) {
        // n�o receber valores negativos como dep�sito
        if (valorDepositado > 0) {
            System.out.printf("VALOR DEPOSITADO: R$%.2f%n", valorDepositado);
            saldo += valorDepositado;
        } else {
            System.out.println("ATEN��O! A CONTA N�O PODE RECEBER VALORES NEGATIVOS COMO DEP�SITO");
        }
    }

    public void extrato() {
        // mostrar na tela o nome do correntista, o n�mero da conta e o saldo
        System.out.println("*****EXTRATO*****");
        System.out.println();
        System.out.println("NOME DO CORRENTISTA: " + this.nomeCorrentista);
        System.out.println("N�MERO DA CONTA: " + this.numeroConta);
        System.out.printf("SALDO ATUAL: R$%.2f%n", this.saldo);
    }
}

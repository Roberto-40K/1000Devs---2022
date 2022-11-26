package com.mesttra.app.poo.carro;

public class Carro {
    private String nome;
    private double peso;
    private String fabricante;
    private String cor;
    private double valor;

    public Carro(String nome, double peso, String fabricante, String cor, double valor) {

        this.setNome(nome);
        this.setPeso(peso);
        this.setFabricante(fabricante);
        this.setCor(cor);
        this.setValor(valor);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
    }

    public void darDesconto(double valorDesconto) {
        if (this.valor - valorDesconto >= 100) {
            System.out.println("DESCONTO PROCESSADO");
            this.valor -= valorDesconto;
        } else {
            System.out.println("DESCONTO NÃO PROCESSADO");
        }
    }
}

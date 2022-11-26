package com.mesttra.app.poo.pessoa;

public class Pessoa {
    String nome;
    String cpf;
    double peso;
    int idade;
    double altura;
    String email;
    boolean usaOculos;

    public void alteraEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public Pessoa(String nomeNovo, String cpf, double peso, int idade, double altura, String email) {
        this.nome = nomeNovo;
        this.cpf = cpf;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
        this.email = email;
        this.usaOculos = usaOculos;
    }
}

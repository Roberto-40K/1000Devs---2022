package com.mesttra.app.poo.pessoa;

public class ProgramaPrincipal {
    public static void main(String[] args) {


        Pessoa joao = new Pessoa("João", "7899456123", 95.4, 66, 1.92, "joao@joao.com");
        Pessoa jose = new Pessoa("José", "54687998689", 55.4, 24, 1.55, "jose@jose.com");

        System.out.println("CPF do João: " + joao.cpf);
        System.out.println("CPF do José: " + jose.cpf);

        System.out.println("EMAIL: " + joao.email);
        joao.alteraEmail("joao@smartrr.com");
        System.out.println("EMAIL: " + joao.email);

        System.out.println("João usa oculos: " + joao.usaOculos);
        System.out.println("José usa óculos: " + jose.usaOculos);
    }
}

package com.mesttra.app.poo.empresa_tecnologia;

public class Programador extends Funcionario {
    private String linguagem;
    private String tipoProgramador;


    public Programador(String nome, String cpf, double salario, double horasSemanais, String linguagem, String tipoProgramador) {
        super(nome, cpf, salario, horasSemanais);
        this.linguagem = linguagem;
        this.tipoProgramador = tipoProgramador;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getTipoProgramador() {
        return tipoProgramador;
    }

    public void setTipoProgramador(String tipoProgramador) {
        this.tipoProgramador = tipoProgramador;
    }

    @Override
    public void status() {
        System.out.println();
        System.out.println("*****STATUS DO PROGRAMADOR*****");
        super.status();
        System.out.println("LINGUAGEM: " + this.getLinguagem().toUpperCase());
        System.out.println("ÁREA DE PROGRAMAÇÃO: " + this.getTipoProgramador().toUpperCase());
        System.out.println();
    }
}

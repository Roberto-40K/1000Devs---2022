package com.mesttra.app.poo.empresa_tecnologia;

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;
    protected double horasSemanais;


    public Funcionario(String nome, String cpf, double salario, double horasSemanais) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.horasSemanais = horasSemanais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(double horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public void status() {
        System.out.println("NOME: " + this.getNome().toUpperCase());
        System.out.println("CPF: " + this.getCpf().toUpperCase());
        System.out.println("SALÁRIO: R$" + this.getSalario());
        System.out.println("HORAS SEMANAIS: " + this.getHorasSemanais());
    }
}

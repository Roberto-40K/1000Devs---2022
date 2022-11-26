package com.mesttra.app.poo.universidade;

import java.util.*;

public abstract class Funcionario {
    Scanner teclado = new Scanner(System.in);

    protected String nome;
    protected String cpf;
    protected String numeroDeRegistro;
    protected String orgaoDeLotacao;
    protected double salario;

    public Funcionario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {

        this.setNome(nome);
        this.setCpf(cpf);
        this.setNumeroDeRegistro(numeroDeRegistro);
        this.setOrgaoDeLotacao(orgaoDeLotacao);
        this.setSalario(salario);

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

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void inserirDados() {

        System.out.print("DIGITE O NOME: ");
        teclado = new Scanner(System.in);
        this.setNome(teclado.nextLine());

        System.out.print("DIGITE O CPF: ");
        this.setCpf(teclado.next());

        System.out.print("N�MERO DE REGISTRO: ");
        this.setNumeroDeRegistro(teclado.next());

        System.out.print("ORG�O DE LOTA��O: ");
        this.setOrgaoDeLotacao(teclado.next());

        System.out.print("Sal�rio: ");
        this.setSalario(teclado.nextDouble());
    }

    public void aumentaSalario() {
        this.setSalario(getSalario() * 1.10);
    }

    public void nomeRegistro() {

        System.out.println();
        System.out.println("INSIRA OS DADOS DO FUNCION�RIO");
        System.out.println();
    }

    public void status() {

        System.out.println("NOME: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("N�MERO DE REGISTRO: " + this.getNumeroDeRegistro());
        System.out.println("ORG�O DE LOTA��O: " + this.getOrgaoDeLotacao());
        System.out.println("SAL�RIO: R$" + this.getSalario());

    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nN�mero de Registro: " + this.getNumeroDeRegistro() + "\nOrg�o de Lota��o: " + this.getOrgaoDeLotacao() + "\nSal�rio: " + this.getSalario();
    }
}

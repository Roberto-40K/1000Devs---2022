package com.mesttra.app.poo.universidade;

public class Professores extends Funcionario{

    private String nivelDeGraduacao, disciplinaMinistrada;
    private int qtdeAlunos, qtdeTurmas;

    public Professores() {
        super(null, null, null, null, 0);
        this.inserirDados();
    }
//    public Professores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdeAlunos, int qtdeTurmas) {
//
//        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
//        this.setNivelDeGraduacao(nivelDeGraduacao);
//        this.setDiciplinaMinistrada(disciplinaMinistrada);
//        this.setQtdeAlunos(qtdeAlunos);
//        this.setQtdeTurmas(qtdeTurmas);
//
//    }

    @Override
    public void nomeRegistro() {

        System.out.println();
        System.out.println("INSIRA O NOME DO PROFESSOR");
        System.out.println();
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDiciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDiciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdeAlunos() {
        return qtdeAlunos;
    }

    public void setQtdeAlunos(int qtdeAlunos) {
        this.qtdeAlunos = qtdeAlunos;
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }

    public void setQtdeTurmas(int qtdeTurmas) {
        this.qtdeTurmas = qtdeTurmas;
    }

    public void addAluno(int adicaoAlunos) {
        this.setQtdeAlunos(this.getQtdeAlunos() + adicaoAlunos);
    }

    public void addTurma(int adicaoTurma) {
        this.setQtdeTurmas(this.getQtdeTurmas() + adicaoTurma);
    }

    @Override
    public void inserirDados() {


            super.inserirDados();

            System.out.print("DIGITE O NÍVEL DE GRADUAÇÃO: ");
            this.setNivelDeGraduacao(teclado.next());

            System.out.print("DISCIPLINA MINISTRADA: ");
            this.setDiciplinaMinistrada(teclado.next());

            System.out.print("DIGITE A QUANTIDADE DE ALUNOS(A): ");
            this.setQtdeAlunos(teclado.nextInt());

            System.out.print("DIGITE A QUANTIDADE DE TURMAS: ");
            this.setQtdeTurmas(teclado.nextInt());
            System.out.println();

    }

    @Override
    public void status() {

        super.status();

        System.out.println("NÍVEL DE GRADUAÇÃO: " + this.getNivelDeGraduacao());
        System.out.println("DISCIPLINA MINISTRADA: " + this.getDiciplinaMinistrada());
        System.out.println("QUANTIDADE DE ALUNOS: " + this.getQtdeAlunos());
        System.out.println("QUANTIDADE DE TURMAS: " + this.getQtdeTurmas());

    }

    @Override
    public void aumentaSalario() {
        super.aumentaSalario();
    }

    @Override
    public String toString() {
        return super.toString() + "\nNível de Graduação: " + this.getNivelDeGraduacao() + "\nDisciplina Ministrada: " + this.getDiciplinaMinistrada() + "\nQuantidade de Alunos: " + this.getQtdeAlunos() + "\nQuantidade de Turmas: " + this.getQtdeTurmas();
    }
}

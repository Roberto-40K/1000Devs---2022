package com.mesttra.app.poo.universidade;

public class FuncionariosAdministrativos extends Funcionario {

    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.setFuncaoAdministrativa(funcaoAdministrativa);
        this.setSenioridade(senioridade);

    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public void nomeRegistro() {

        System.out.println();
        System.out.println("INSIRA O NOME DO FUNCIONÁRIO ADMINISTRATIVO");
        System.out.println();
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.print("INFORME A FUNÇÃO ADMINISTRATIVA: ");
        this.setFuncaoAdministrativa(teclado.next());
        System.out.println("DIGITE O NÍVEL DE SENIORIDADE: ");
        this.setSenioridade(teclado.next());
    }

    @Override
    public void status() {
        super.status();
        System.out.println("FUNÇÃO ADMINISTRATIVA: " + this.getFuncaoAdministrativa());
        System.out.println("SENIORIDADE: " + this.getSenioridade());
    }

    @Override
    public void aumentaSalario() {
        super.aumentaSalario();
    }

    @Override
    public String toString() {
        return super.toString() + "\nFunção Administrativa: " + this.getFuncaoAdministrativa() + "\nSenioridade: " + this.getSenioridade();
    }
}

package com.mesttra.app.poo.empresa_tecnologia;

public class LiderTecnico extends Funcionario{

    public LiderTecnico(String nome, String cpf, double salario, double horasSemanais) {
        super(nome, cpf, salario, horasSemanais);
    }

    @Override
    public void status() {
        System.out.println();
        System.out.println("*****STATUS DO L�DER T�CNICO*****");
        super.status();
        System.out.print("PROGRAMADORES SUPERVISIONADOS: ");
    }
}

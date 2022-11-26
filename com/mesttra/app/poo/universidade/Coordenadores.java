package com.mesttra.app.poo.universidade;

import java.util.ArrayList;

public class Coordenadores extends Funcionario {

    private ArrayList<Professores> professores = new ArrayList<>();

    public Coordenadores() {
        super(null, null, null, null, 0);
        super.inserirDados();
    }

    public boolean adicionaProfessor(Professores professores) {
        if (this.professores.size() < 10) {
            this.professores.add(professores);
            return true;
        }
        return false;
    }

    public ArrayList<Professores> getProfessores() {
        return professores;
    }

    @Override
    public void nomeRegistro() {

        System.out.println();
        System.out.println("INSIRA OS DADOS DO COORDENADOR");
        System.out.println();
    }

    @Override
    public void aumentaSalario() {
        super.setSalario(super.getSalario() * 1.05);
    }

    @Override
    public void status() {
        System.out.println();
        System.out.println("COORDENADOR");
        super.status();
        System.out.print("PROFESSORES SUPERVISIONADOS: ");
    }


}

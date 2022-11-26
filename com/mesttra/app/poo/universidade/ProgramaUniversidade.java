package com.mesttra.app.poo.universidade;

import java.util.*;

public class ProgramaUniversidade {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Professores> coordenador = new ArrayList<>();


        for (int indice = 1; indice <= 10; indice++) {
            System.out.println();
            System.out.println("INSIRA OS DADOS DO " + indice + "º " + "PROFESSOR");
            Professores professores = new Professores();
            coordenador.add(professores);
        }

        Coordenadores coordenadores = new Coordenadores();
        coordenadores.status();
        coordenadores.aumentaSalario();

        for (Professores professores: coordenador) {
            System.out.print(professores.getNome() + ", ");
        }



//        Professores professor1 = new Professores("Giselle Marquês", "111.222.333-45", "33", "Universidade", 5500, "Mestrado", "Física", 40, 4);
//        Professores professor2 = new Professores("Leia Organa", "411.222.333-95", "43", "Universidade", 5500, "Mestrado", "Matemática", 40, 4);
//        Professores professor3 = new Professores("Rico", "115.722.333-45", "53", "Universidade", 5500, "Mestrado", "Português", 40, 4);
//        Professores professor4 = new Professores("João Frango", "119.212.337-85", "03", "Universidade", 5500, "Mestrado", "Orientação a Objetos", 40, 4);
//        Professores professor5 = new Professores("Sheev Palpatine", "141.221.533-15", "63", "Universidade", 5500, "Mestrado", "Filosofia", 40, 4);
//        Professores professor6 = new Professores("Rey", "111.222.333-45", "63", "Universidade", 5500, "Mestrado", "Sociologia", 40, 4);
//        Professores professor7 = new Professores("João das Neves", "111.224.343-43", "43", "Universidade", 5500, "Mestrado", "Biologia", 40, 4);
//        Professores professor8 = new Professores("Paulo Marquês", "111.222.313-47", "13", "Universidade", 5500, "Mestrado", "História", 40, 4);
//        Professores professor9 = new Professores("Carmen Marquês", "151.282.314-48", "93", "Universidade", 5500, "Mestrado", "Geografia", 40, 4);
//        Professores professor10 = new Professores("Kassandra Carvalho", "191.242.363-55", "333", "Universidade", 5500, "Mestrado", "Química", 40, 4);
//        professor1.status();
//
//        Coordenadores coordenadores = new Coordenadores("Marcos Mota", "111.111.111-11", "24", "Universidade", 8000);
//        coordenadores.status();
//        coordenadores.adicionaProfessor(professor1);
//        coordenadores.adicionaProfessor(professor2);
//        coordenadores.adicionaProfessor(professor3);
//        coordenadores.adicionaProfessor(professor4);
//        coordenadores.adicionaProfessor(professor5);
//        coordenadores.adicionaProfessor(professor6);
//        coordenadores.adicionaProfessor(professor7);
//        coordenadores.adicionaProfessor(professor8);
//        coordenadores.adicionaProfessor(professor9);
//        coordenadores.adicionaProfessor(professor10);
    }
}

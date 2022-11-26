package com.mesttra.app.poo.empresa_tecnologia;

import java.util.*;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner input;
        ArrayList<Programador> programadores = new ArrayList<>();

        char opcao;
        do {
            System.out.println();
            System.out.print("Digite o nome do Programador: ");
            input = new Scanner(System.in);
            String nome = input.nextLine();

            System.out.print("Digite o cpf: ");
            String cpf = input.next();

            System.out.print("Digite o salário: R$");
            double salario = input.nextDouble();

            System.out.print("Digite quantidade de horas semanais: ");
            double horasSemanais = input.nextDouble();

            System.out.print("Digite a linguagem de programação: ");
            String linguagem = input.next();

            System.out.print("Digite a área do programador: ");
            String tipoProgramador = input.next();

            Programador programador = new Programador(nome, cpf, salario, horasSemanais, linguagem, tipoProgramador);
            programadores.add(programador);

            System.out.print("Deseja continuar o cadastro? digite s ou S para Sim: ");
            opcao = input.next().charAt(0);

        } while (opcao == 'S' || opcao == 's');

        LiderTecnico liderTecnico = new LiderTecnico("João Carlos", "2222", 8000, 20);
        liderTecnico.status();

        for (Programador dev:programadores) {
            System.out.print(dev.getNome() + " || ");
        }
    }
}

package com.mesttra.app.lista2;

//        Questão 02: Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
//        funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. Caso
//        o funcionário receba menos que 1 salário mínimo deverá ser apresentado a mensagem
//        Funcionário ganha menos que um salário mínimo.

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: R$");
        double salarioMinimo = teclado.nextDouble();

        System.out.print("Informe o valor do salário do funcionário: R$");
        double salarioFuncionario = teclado.nextDouble();

        double calc = salarioFuncionario / salarioMinimo;

        if (salarioFuncionario > salarioMinimo) {
            System.out.println("O funcionário recebe " + calc + " salários mínimos!");
        } else {
            System.out.println("O funcionário ganha menos que um salário mínimo!");
        }

        teclado.close();
    }
}

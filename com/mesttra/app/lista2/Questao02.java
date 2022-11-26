package com.mesttra.app.lista2;

//        Quest�o 02: Fa�a um algoritmo que receba o valor do sal�rio m�nimo e o valor do sal�rio de um
//        funcion�rio, calcule e mostre a quantidade de sal�rios m�nimos que ganha esse funcion�rio. Caso
//        o funcion�rio receba menos que 1 sal�rio m�nimo dever� ser apresentado a mensagem
//        Funcion�rio ganha menos que um sal�rio m�nimo.

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do sal�rio m�nimo: R$");
        double salarioMinimo = teclado.nextDouble();

        System.out.print("Informe o valor do sal�rio do funcion�rio: R$");
        double salarioFuncionario = teclado.nextDouble();

        double calc = salarioFuncionario / salarioMinimo;

        if (salarioFuncionario > salarioMinimo) {
            System.out.println("O funcion�rio recebe " + calc + " sal�rios m�nimos!");
        } else {
            System.out.println("O funcion�rio ganha menos que um sal�rio m�nimo!");
        }

        teclado.close();
    }
}

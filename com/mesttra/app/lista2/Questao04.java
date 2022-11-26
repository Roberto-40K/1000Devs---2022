package com.mesttra.app.lista2;

import java.util.Scanner;
import java.lang.Math;

//        Questão 04: Faça um algoritmo que calcule e mostre a tabuada de uma operação matemática
//        que deverá ser informada pelo usuário (+, -, * e /) além do número digitado pelo usuário para o
//        calculo da operação.

public class Questao04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a operação desejada: ");
        String operacao = teclado.next();

        if (!operacao.equals("-") && !operacao.equals("+") && !operacao.equals("x") && !operacao.equals("*") && !operacao.equals("/")) {

            System.out.println("Operação digitada incorreta!");

        } else {

            System.out.print("Informe o número da tabuada: ");
            int tabuada = teclado.nextInt();

            System.out.println("Tabuada de " + operacao + " para o número " + tabuada);

            for (int x = 1; x <= 10; x++) {

                switch (operacao) {
                    case "-" -> {
                        int resultado = Math.abs(tabuada - x);
                        System.out.println(tabuada + " " + operacao + " " + x + " = " + resultado);

                    }
                    case "+" -> {
                        int resultado = Math.abs(tabuada + x);
                        System.out.println(tabuada + " " + operacao + " " + x + " = " + resultado);

                    }
                    case "x" -> {
                        int resultado = Math.abs(tabuada * x);
                        System.out.println(tabuada + " " + operacao + " " + x + " = " + resultado);

                    }
                    case "/" -> {
                        int resultado = Math.abs(tabuada / x);
                        System.out.println(tabuada + " " + operacao + " " + x + " = " + resultado);

                    }
                }
            }
        }

        teclado.close();
    }
}


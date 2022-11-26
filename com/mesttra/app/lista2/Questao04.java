package com.mesttra.app.lista2;

import java.util.Scanner;
import java.lang.Math;

//        Quest�o 04: Fa�a um algoritmo que calcule e mostre a tabuada de uma opera��o matem�tica
//        que dever� ser informada pelo usu�rio (+, -, * e /) al�m do n�mero digitado pelo usu�rio para o
//        calculo da opera��o.

public class Questao04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a opera��o desejada: ");
        String operacao = teclado.next();

        if (!operacao.equals("-") && !operacao.equals("+") && !operacao.equals("x") && !operacao.equals("*") && !operacao.equals("/")) {

            System.out.println("Opera��o digitada incorreta!");

        } else {

            System.out.print("Informe o n�mero da tabuada: ");
            int tabuada = teclado.nextInt();

            System.out.println("Tabuada de " + operacao + " para o n�mero " + tabuada);

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


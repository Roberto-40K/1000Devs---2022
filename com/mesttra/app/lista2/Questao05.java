package com.mesttra.app.lista2;

import java.util.Scanner;
/*
Quest�o 05: Fa�a um algoritmo que receba dois n�meros inteiros, calcule e mostre a divis�o do
        do maior n�mero pelo menor n�mero. Sabe-se que o segundo n�mero n�o pode ser zero, desta
        forma se o usu�rio digitar 0 dever� ser exibido uma mensagem ?A opera��o n�o pode ser
        realizada?

 */

public class Questao05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        float n1 = teclado.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float n2 = teclado.nextFloat();

        if (n2 == 0) {
            System.out.println("A opera��o n�o pode ser realizada");

        } else {

            float div = n1 / n2;
            System.out.println("A divis�o " + n1 + " por " + n2 + " �: " + div);
        }

        teclado.close();
    }
}

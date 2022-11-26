package com.mesttra.app.lista2;

import java.util.Scanner;
/*
Questão 05: Faça um algoritmo que receba dois números inteiros, calcule e mostre a divisão do
        do maior número pelo menor número. Sabe-se que o segundo número não pode ser zero, desta
        forma se o usuário digitar 0 deverá ser exibido uma mensagem ?A operação não pode ser
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
            System.out.println("A operação não pode ser realizada");

        } else {

            float div = n1 / n2;
            System.out.println("A divisão " + n1 + " por " + n2 + " é: " + div);
        }

        teclado.close();
    }
}

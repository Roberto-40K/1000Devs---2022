package com.mesttra.app.lista2;


//        Questão 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para
//        imprimir a área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário
//        informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro
//        quadrado. Caso a diferença de metragem entre a frente e a lateral seja menor que 10% da
//        metragem da frente, o cliente terá um acréscimo de 22% no valor final do terreno.
//        Caso a metragem da frente for menor que 40% da lateral, o cliente terá um desconto de 12% no
//        valor final do terreno. Caso a metragem da frente for maior que 70% da lateral, o cliente terá um
//        desconto de 15%. Caso as medidas não encaixem em nenhuma das regras o valor final do
//        terreno não sofrerá alterações.


import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        texto.useLocale(Locale.US);

        System.out.print("Quantos metros o terreno possui de frente: ");
        float frente = texto.nextFloat();

        System.out.print("Quantos metros o terreno possui de lateral: ");
        float lateral = texto.nextFloat();

        System.out.print("Informe o valor por metro quadrado: ");
        float valorPorMetroQuadrado = texto.nextFloat();

        System.out.println();

        float area = frente * lateral;
        float valorTerreno = valorPorMetroQuadrado * area;

        float metragem = (float) (frente * 0.10);
        float metragem2 = (float) (frente * 0.40);
        float metragem3 = (float) (frente * 0.70);

        float difere = frente - lateral;

        System.out.println("A área total do terreno de " + frente + "m de frente com " + lateral + "m de lateral é: " + area + "m².");
        System.out.printf("O valor por metro quadrado é: R$%.2f%n", valorPorMetroQuadrado);

        if (difere < metragem) {
            float valorFinal = (float) (valorTerreno * 1.22);
            System.out.printf("O valor final do terreno com acréscimo de 22%% é: R$%.2f%n", valorFinal);

        } else if (difere < metragem2) {

            float desconto = (float) (valorTerreno * 0.12);
            float valorFinal = (valorTerreno - desconto);
            System.out.printf("O valor final do terreno com decréscimo de 12%% é: R$%.2f%n", valorFinal);

        } else if (difere > metragem3) {

            float desconto = (float) (valorTerreno * 0.15);
            float valorFinal = (valorTerreno - desconto);
            System.out.printf("O valor final do terreno com decréscimo de 15%% é: R$%.2f%n", valorFinal);

        } else {
            System.out.printf("O terreno não recebeu nenhuma alteração e custará: R$%.2f%n", valorTerreno);
        }

        texto.close();
    }
}

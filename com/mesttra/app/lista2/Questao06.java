package com.mesttra.app.lista2;

import java.util.Scanner;

//        Questão 06: Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
//        todos os cavalos comprados para um haras. O usuário devera informar a quantidade de cavalos
//        adquiridos e o valor de cada ferradura.

public class Questao06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de cavalos: ");
        float cavalosAdqueridos = teclado.nextFloat();

        System.out.print("Informe o valor de cada ferradura: R$");
        float ferraduras = teclado.nextFloat();

        float ferraduraPorCavalo = 4;
        float ferradurasNecessarias = cavalosAdqueridos * ferraduraPorCavalo;

        System.out.println("Quantidade de ferraduras necessárias: " + ferradurasNecessarias);
        float valorFerradura = ferraduras * ferradurasNecessarias;

        if (valorFerradura >= 15000 && valorFerradura < 20000) {

            float desconto = (float) (valorFerradura * 0.10);
            float valorFinal = (valorFerradura - desconto);

            System.out.println("Valor total para a compra das ferraduras com desconto de 10%: R$" + valorFinal);

        } else if (valorFerradura >= 20000 && valorFerradura < 25000) {

            float desconto = (float) (valorFerradura * 0.12);
            float valorFinal = (valorFerradura - desconto);

            System.out.println("Valor total para a compra das ferraduras com desconto de 12%: R$" + valorFinal);

        } else if (valorFerradura >= 25000 && valorFerradura < 30000) {

            float desconto = (float) (valorFerradura * 0.15);
            float valorFinal = (valorFerradura - desconto);

            System.out.println("Valor total para a compra das ferraduras com desconto de 15%: R$" + valorFinal);

        } else {

            float desconto = (float) (valorFerradura * 0.20);
            float valorFinal = (valorFerradura - desconto);

            System.out.println("Valor total para a compra das ferraduras com desconto de 20%: R$" + valorFinal);

        }

        teclado.close();
    }
}

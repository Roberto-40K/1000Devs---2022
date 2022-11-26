package com.mesttra.app.lista2;

import java.util.Scanner;
import java.lang.Math;

//        Quest�o 07: Fa�a um algoritmo que receba o peso de uma pessoa, calcule e mostre:
//        a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
//        b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
//        c) Uma mensagem ?Voc� deve procurar uma nutricionista? se a diferen�a de acr�scimo de peso
//        (15%) entre o acr�scimo de peso (20%) for maior ou igual a 4,5 kgs

public class Questao07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o peso em KG: ");
        float peso = teclado.nextFloat();

        float ganhouPeso = peso * 1.15f;
        float engordou = peso * 1.20f;
        float emagreceu = peso - peso * 0.20f;
        float kgs = 4.5f;
        float dif = Math.abs(ganhouPeso - engordou);

        if (dif < kgs) {

            System.out.println("Caso a pessoa engorde 15% ficar� com: " + ganhouPeso + "Kg.");
            System.out.println("Caso a pessoa engorde 20% ficar� com: " + engordou + "Kg.");
            System.out.println("Caso a pessoa emagrece 20% ficar� com: " + emagreceu + "Kg.");

        } else {

            System.out.println("Caso a pessoa engorde 15% ficar� com: " + ganhouPeso + "Kg.");
            System.out.println("Caso a pessoa engorde 20% ficar� com: " + engordou + "Kg.");
            System.out.println("Voc� deve procurar um nutricionista!");

        }
        teclado.close();
    }
}

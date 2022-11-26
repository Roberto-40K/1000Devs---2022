package com.mesttra.app.lista2;

import java.util.Scanner;

//        Questão 03:Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a
//        sua média ponderada(as notas tem pesos respectivos de 1,2 e 3).Calcule o valor das notas com
//        base em seus pesos e além de apresentar a média,exiba a maior nota entre as 3 notas,ou a
//        mensagem As 3 notas são iguais,ou As notas 1 e 2 são as maiores, As notas 1 e 3 são as
//        maiores, As notas 2 e 3 são as maiores caso exista duas notas iguais e elas sejam as maiores.

public class Questao03 {
    public static float informeNota(String palavra) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a " + palavra + " nota: ");
        return teclado.nextFloat();
    }

    public static void main(String[] args) {

        float nota1 = informeNota("primeira");
        float nota2 = informeNota("segunda");
        float nota3 = informeNota("terceira");

        float peso1 = nota1 * 1;
        float peso2 = nota2 * 2;
        float peso3 = nota3 * 3;

        float media = nota1 + nota2 + nota3 / 3;
        float mediaPonderada = peso1 + peso2 + peso3 / 6;

        System.out.println("A média do aluno é: " + media);

        if (peso1 == peso2 && peso1 == peso3) {

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e " + nota3 + " é: " + mediaPonderada);
            System.out.print("As três notas são iguais.");

        } else if (peso1 > peso2 && peso1 > peso3) {

            float maiorNota = peso1;

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e " + nota3 + " é: " + mediaPonderada);
            System.out.print("A nota " + nota1 + " é a maior nota após o peso " + nota1 + "(" + maiorNota + ")");

        } else if (peso2 > peso3 && peso2 > peso1) {

            float maiorNota = peso2;

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e " + nota3 + " é: " + mediaPonderada);
            System.out.print("A nota " + nota2 + " é a maior nota após o peso " + nota2 + "(" + maiorNota + ")");

        } else if (peso3 > peso2 && peso3 > peso1) {

            float maiorNota = peso3;

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e " + nota3 + " é: " + mediaPonderada);
            System.out.print("A nota " + nota3 + " é a maior nota após o peso " + nota3 + "(" + maiorNota + ")");

        } else if (peso1 == peso2 && peso1 != peso3) {

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e " + nota3 + " é: " + mediaPonderada);
            System.out.println("As notas 1 " + "(" + nota1 + ")" + " e 2 " + "(" + nota2 + ") foram as maiores notas após o calculo do peso 1" + "(" + peso1 + ") e peso 2(" + peso2 + ")");

        } else if (peso2 == peso3 && peso2 != peso1) {

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e " + nota3 + " é: " + mediaPonderada);
            System.out.println("As notas 2 " + "(" + nota2 + ")" + " e 3 " + "(" + nota3 + ") foram as maiores notas após o calculo do peso 2" + "(" + peso2 + ") e peso 3(" + peso3 + ")");

        } else {

            System.out.println("A média ponderada das notas " + nota1 + ", " + nota2 + " e  " + nota3 + " é: " + mediaPonderada);
            System.out.println("As notas 1 " + "(" + nota1 + ")" + " e 3 " + "(" + nota3 + ") foram as maiores notas após o calculo do peso 1" + "(" + peso1 + ") e peso 3(" + peso3 + ")");
        }
    }
}

package com.mesttra.app.looping;

import java.util.*;

/*
 Foi feita uma pesquisa entre os habitantes de uma regi�o e coletados os dados de altura e sexo (m, f) das pessoas.
 Fa�a um programa que leia estes dados e que continue a leitura caso o usu�rio responda (s) e pare a execu��o se ele digitar (n).
 Ao final exiba os seguintes dados:

- m�dia da altura das mulheres;
- maior e a menor altura;
- percentual de homens que participaram da pesquisa;

 */
public class ExercicioDeRepeticao03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        float somaAlturaMulheres = 0, mediaAlturaDasMulheres = 1, qtdeAltura = 0, menorAltura = 0, maiorAltura = 0;
        int qtdeMulheres = 0, totalIndividuos = 1, qtdeHomens = 0;
        char escolha;

        do {
            System.out.print("Informe a sua altura: ");
            float altura = teclado.nextFloat();

            System.out.print("Informe o seu sexo: ");
            char sexo = teclado.next().charAt(0);

            System.out.print("Deseja continuar (s/n): ");
            escolha = teclado.next().charAt(0);

            System.out.println("      ");

            if (sexo == 'F' || sexo == 'f') {
                qtdeMulheres++;
                somaAlturaMulheres = somaAlturaMulheres + altura;
                mediaAlturaDasMulheres = somaAlturaMulheres / qtdeMulheres;
            }

            qtdeAltura += 1;

            if (qtdeAltura == 1) {
                maiorAltura = menorAltura = altura;

            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }

                if (altura < menorAltura) {
                    menorAltura = altura;
                }
            }

            if (escolha == 'S' || escolha == 's') {
                totalIndividuos++;
            }

            if (sexo == 'M' || sexo == 'm') {
                qtdeHomens++;
            }

        } while (escolha == 'S' || escolha == 's');

        System.out.printf("A altura m�dia das mulheres: %.2f%n", mediaAlturaDasMulheres);
        System.out.printf("A menor altura �: %.2f%n", menorAltura);
        System.out.printf("A maior altura �: %.2f%n", maiorAltura);
        System.out.printf("O percentual de homens �: %.1f", (float) qtdeHomens / totalIndividuos * 100);
        System.out.println("%");

        teclado.close();
    }
}

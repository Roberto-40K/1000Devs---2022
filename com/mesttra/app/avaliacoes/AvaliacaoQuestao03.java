package com.mesttra.app.avaliacoes;
// Aluno: Roberto Carlos Santos Da Silva
// Data: 07/09/2022

import java.util.*;
import java.util.InputMismatchException;

public class AvaliacaoQuestao03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do indivíduo 01: ");
        String individuo01 = teclado.nextLine();

        try {
            System.out.print("Digite a idade do(a) " + individuo01 + ": ");
            byte idade01 = teclado.nextByte();

            System.out.print("Digite o sexo do(a) " + individuo01 + ": ");
            String sexo01 = teclado.next();

            if (sexo01.equalsIgnoreCase("M") || sexo01.equalsIgnoreCase("F")) {

                if (idade01 <= 13) {
                    System.out.println(individuo01 + " é criança.");

                } else if (idade01 > 13 && idade01 < 20) {
                    System.out.println(individuo01 + " é adolescente.");

                } else if (idade01 >= 20 && idade01 < 50) {
                    System.out.println(individuo01 + " é adulto.");

                } else {
                    System.out.println(individuo01 + " é da melhor idade.");
                }

            } else {
                System.out.println("Você só pode digitar 'M' ou 'm' para sexo masculino e 'F' ou 'f' para sexo feminino!");
            }

            System.out.println("                ");

            System.out.print("Digite o nome do individuo 02: ");
            teclado.nextLine(); //Limpeza de buffer
            String individuo02 = teclado.nextLine();

            try {
                System.out.print("Digite a idade do(a) " + individuo02 + ": ");
                byte idade02 = teclado.nextByte();

                System.out.print("Digite o sexo do(a) " + individuo02 + ": ");
                String sexo02 = teclado.next();


                if (sexo02.equalsIgnoreCase("M") || sexo02.equalsIgnoreCase("F")) {

                    if (idade02 <= 13) {
                        System.out.println(individuo02 + " é criança.");

                    } else if (idade02 > 13 && idade02 < 20) {
                        System.out.println(individuo02 + " é adolescente.");

                    } else if (idade02 >= 20 && idade02 < 50) {
                        System.out.println(individuo02 + " é adulto.");

                    } else {
                        System.out.println(individuo02 + " é da melhor idade.");
                    }

                } else {
                    System.out.println("Você só pode digitar 'M' ou 'm' para sexo masculino e 'F' ou 'f' para sexo feminino!");

                }

                System.out.println("                ");

                System.out.print("Digite o nome do individuo 03: ");
                teclado.nextLine(); //Limpeza de buffer
                String individuo03 = teclado.nextLine();
                System.out.print("Digite a idade do(a) " + individuo03 + ": ");

                try {
                    byte idade03 = teclado.nextByte();
                    System.out.print("Digite o sexo do(a) " + individuo03 + ": ");
                    String sexo03 = teclado.next();

                    if (sexo03.equalsIgnoreCase("M") || sexo03.equalsIgnoreCase("F")) {
                        if (idade03 <= 13) {
                            System.out.println(individuo03 + " é criança.");

                        } else if (idade03 > 13 && idade03 < 20) {
                            System.out.println(individuo03 + " é adolescente.");

                        } else if (idade03 >= 20 && idade03 < 50) {
                            System.out.println(individuo03 + " é adulto.");

                        } else {
                            System.out.println(individuo03 + " é da melhor idade.");
                        }

                    } else {
                        System.out.println("Você só pode digitar 'M' ou 'm' para sexo masculino e 'F' ou 'f' para sexo feminino!");
                    }

                    System.out.println("                ");

                    if (idade01 <= 0) {
                        System.out.println("A idade do(a) " + individuo01 + " não pode ser menor ou igual a zero! Tente novamente! ");

                        if (idade02 <= 0)
                            System.out.println("A idade do(a) " + individuo02 + " não pode ser menor ou igual a zero! Tente novamente! ");

                        if (idade03 <= 0)
                            System.out.println("A idade do(a) " + individuo03 + " não pode ser menor ou igual a zero! Tente novamente! ");

                    } else {

                        int crianca = 0;

                        if (idade01 <= 13)
                            crianca = crianca + 1;

                        if (idade02 <= 13)
                            crianca = crianca + 1;

                        if (idade03 <= 13)
                            crianca = crianca + 1;

                        System.out.println("Total de crianças:" + crianca);

                        int adolescente = 0;

                        if (idade01 > 13 && idade01 < 20)
                            adolescente = adolescente + 1;

                        if (idade02 > 13 && idade02 < 20)
                            adolescente = adolescente + 1;

                        if (idade03 > 13 && idade03 < 20)
                            adolescente = adolescente + 1;

                        System.out.println("Total de Adolescentes:" + adolescente);

                        int adulto = 0;

                        if (idade01 >= 20 && idade01 < 50)
                            adulto = adulto + 1;

                        if (idade02 >= 20 && idade02 < 50)
                            adulto = adulto + 1;

                        if (idade03 >= 20 && idade03 < 50)
                            adulto = adulto + 1;

                        System.out.println("Total de Adultos:" + adulto);

                        int melhorIdade = 0;

                        if (idade01 > 50)
                            melhorIdade = melhorIdade + 1;

                        if (idade02 > 50)
                            melhorIdade = melhorIdade + 1;

                        if (idade03 > 50)
                            melhorIdade = melhorIdade + 1;

                        System.out.println("Total de Melhor Idade:" + melhorIdade);

                        System.out.println("                ");

                        if (idade01 > idade02 && idade01 > idade03) {
                            System.out.println("O nome do indivíduo mais velho é: " + individuo01);

                        } else if (idade02 > idade01 && idade02 > idade03) {
                            System.out.println("O nome do indivíduo mais velho é: " + individuo02);

                        } else {
                            System.out.println("O nome do indivíduo mais velho é: " + individuo03);
                        }
                    }

                } catch (InputMismatchException erro) {
                    System.out.println("ATENÇÃO! A idade só processa números inteiros, tente novamente!");
                }

            } catch (InputMismatchException erro) {
                System.out.println("ATENÇÃO! A idade só processa números inteiros, tente novamente!");
            }

        } catch (InputMismatchException erro) {
            System.out.println("ATENÇÃO! A idade só processa números inteiros, tente novamente!");
        }

        teclado.close();
    }
}
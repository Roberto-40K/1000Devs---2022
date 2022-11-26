package com.mesttra.app.avaliacoes;
// Aluno: Roberto Carlos Santos Da Silva
// Data: 06/09/2022

import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class AvaliacaoQuestao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("      ");
        System.out.println("=========== Menu de Votação ===========");
        System.out.println("      ");
        System.out.println("1 - Candidato A");
        System.out.println("2 - Candidato B");
        System.out.println("3 - Candidato C");
        System.out.println("4 - Voto Nulo");
        System.out.println("      ");

        int primeiroVoto;
        int segundoVoto;
        int terceiroVoto;
        int quartoVoto;
        int quintoVoto;

        System.out.print("Digite o código do candidato para o primeiro voto: ");

        try {
            primeiroVoto = teclado.nextInt();
            System.out.print("Digite o código do candidato para o segundo voto: ");

            try {
                segundoVoto = teclado.nextInt();
                System.out.print("Digite o código do candidato para o terceiro voto: ");

                try {
                    terceiroVoto = teclado.nextInt();
                    System.out.print("Digite o código do candidato para o quarto voto: ");

                    try {
                        quartoVoto = teclado.nextInt();
                        System.out.print("Digite o código do candidato para o quinto voto: ");

                        try {
                            quintoVoto = teclado.nextInt();

                            int candidatoA = 0;
                            int candidatoB = 0;
                            int candidatoC = 0;
                            int votoNulo = 0;

                            System.out.println(" ");

                            if (primeiroVoto > 4 || primeiroVoto <= 0) {
                                System.out.println("Opção inválida no primeiro voto! Só pode digitar os números de 1 até 4. Tente novamente!");
                            }

                            if (segundoVoto > 4 || segundoVoto <= 0) {
                                System.out.println("Opção inválida no segundo voto! Só pode digitar os números de 1 até 4. Tente novamente!");
                            }

                            if (terceiroVoto > 4 || terceiroVoto <= 0) {
                                System.out.println("Opção inválida no terceiro voto! Só pode digitar os números de 1 até 4. Tente novamente!");
                            }

                            if (quartoVoto > 4 || quartoVoto <= 0) {
                                System.out.println("Opção inválida no quarto voto! Só pode digitar os números de 1 até 4. Tente novamente!");
                            }

                            if (quintoVoto > 4 || quintoVoto <= 0) {
                                System.out.println("Opção inválida no quinto voto! Só pode digitar os números de 1 até 4. Tente novamente!");

                            } else {

                                if (primeiroVoto == 4)
                                    votoNulo = votoNulo + 1;

                                if (segundoVoto == 4)
                                    votoNulo = votoNulo + 1;

                                if (terceiroVoto == 4)
                                    votoNulo = votoNulo + 1;

                                if (quartoVoto == 4)
                                    votoNulo = votoNulo + 1;

                                if (quintoVoto == 4)
                                    votoNulo = votoNulo + 1;

                                int totalDeVotosNulos = votoNulo;
                                int totalDeVotos = 5;
                                int resultado = totalDeVotos - totalDeVotosNulos;
                                float percentualDeVotosValidos = Math.abs(resultado * 20);

                                System.out.println("Percentual de votos válidos: " + percentualDeVotosValidos + "%");

                                if (primeiroVoto == 1)
                                    candidatoA = candidatoA + 1;

                                if (segundoVoto == 1)
                                    candidatoA = candidatoA + 1;

                                if (terceiroVoto == 1)
                                    candidatoA = candidatoA + 1;

                                if (quartoVoto == 1)
                                    candidatoA = candidatoA + 1;

                                if (quintoVoto == 1)
                                    candidatoA = candidatoA + 1;

                                int totalCandidatoA = Math.abs(candidatoA);
                                float percentualDeVotos01 = Math.abs(totalCandidatoA * 20);

                                System.out.println("Percentual de votos candidato 1: " + percentualDeVotos01 + "%");

                                if (primeiroVoto == 2)
                                    candidatoB = candidatoB + 1;

                                if (segundoVoto == 2)
                                    candidatoB = candidatoB + 1;

                                if (terceiroVoto == 2)
                                    candidatoB = candidatoB + 1;

                                if (quartoVoto == 2)
                                    candidatoB = candidatoB + 1;

                                if (quintoVoto == 2)
                                    candidatoB = candidatoB + 1;

                                int totalCandidatoB = Math.abs(candidatoB);
                                float percentualDeVotos02 = Math.abs(totalCandidatoB * 20);

                                System.out.println("Percentual de votos candidato 2: " + percentualDeVotos02 + "%");

                                if (primeiroVoto == 3)
                                    candidatoC = candidatoC + 1;

                                if (segundoVoto == 3)
                                    candidatoC = candidatoC + 1;

                                if (terceiroVoto == 3)
                                    candidatoC = candidatoC + 1;

                                if (quartoVoto == 3)
                                    candidatoC = candidatoC + 1;

                                if (quintoVoto == 3)
                                    candidatoC = candidatoC + 1;

                                int totalCandidatoC = Math.abs(candidatoC);
                                float percentualDeVotos03 = Math.abs(totalCandidatoC * 20);

                                System.out.println("Percentual de votos candidato 3: " + percentualDeVotos03 + "%");
                            }

                        } catch (InputMismatchException exception) {
                            System.out.println("ATENÇÃO! Só pode digitar números inteiros na votação. Tente novamente!");
                        }

                    } catch (InputMismatchException exception) {
                        System.out.println("ATENÇÃO! Só pode digitar números inteiros na votação. Tente novamente!");
                    }

                } catch (InputMismatchException exception) {
                    System.out.println("ATENÇÃO! Só pode digitar números inteiros na votação. Tente novamente!");
                }

            } catch (InputMismatchException exception) {
                System.out.println("ATENÇÃO! Só pode digitar números inteiros na votação. Tente novamente!");
            }

        } catch (InputMismatchException exception) {
            System.out.println("ATENÇÃO! Só pode digitar números inteiros na votação. Tente novamente!");
        }

        teclado.close();
    }
}

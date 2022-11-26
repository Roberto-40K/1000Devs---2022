package com.mesttra.app.avaliacoes;
// Aluno: Roberto Carlos Santos Da Silva
// Data: 10/09/2022
import java.util.Scanner;
import java.util.InputMismatchException;

public class AvaliacaoQuestao01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valorDigitado;

        System.out.print("Digite a quantidade de dinheiro a ser sacada: ");

        try {
            valorDigitado = teclado.nextInt();

            System.out.println("      ");

            if (valorDigitado <= 0) {
                System.out.println("Valor não pode ser menor ou igual à 0.");

            } else if (valorDigitado < 5) {
                System.out.println("Você só pode sacar valores a partir de R$5.00");

            } else {

                System.out.println("100 reais: " + valorDigitado / 100);
                valorDigitado = valorDigitado - valorDigitado / 100 * 100;
                System.out.println("50 reais: " + valorDigitado / 50);
                valorDigitado = valorDigitado % 50;
                System.out.println("20 reais: " + valorDigitado / 20);
                valorDigitado = valorDigitado % 20;
                System.out.println("10 reais: " + valorDigitado / 10);
                valorDigitado = valorDigitado % 10;
                System.out.println("5 reais: " + valorDigitado / 5);
            }
        }catch (InputMismatchException exception) {
            System.out.println("ATENÇÃO! Só pode digitar números inteiros. Tente novamente!");
        }
        teclado.close();
    }

}


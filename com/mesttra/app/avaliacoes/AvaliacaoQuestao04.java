package com.mesttra.app.avaliacoes;
//Aluno: Roberto Carlos Santos Da Silva
//Data: 10/09/2022

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AvaliacaoQuestao04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        float compraVista = 0, compraParcelada = 0, descontos = 0, juros = 0;

        try {
            for (byte compra = 1; compra <= 5; compra++) {

                System.out.println("                 ");
                System.out.println("Compra " + compra);

                System.out.print("Digite o valor total: R$ ");
                float valorTotal = teclado.nextFloat();

                System.out.print("Digite a forma de pagamento: ");
                byte formaDePagamento = teclado.nextByte();

                if (formaDePagamento == 1) {

                    byte desconto = 8;
                    descontos += (valorTotal * 0.08);

                    float valorFinal = (float) (valorTotal - (valorTotal * 0.08));
                    compraVista += valorFinal;

                    System.out.println("Desconto de " + desconto + "%");
                    System.out.printf("Valor final: R$ %.2f\n", valorFinal);

                } else if (formaDePagamento == 2) {

                    byte desconto = 4;
                    descontos += (valorTotal * 0.04);

                    float valorFinal = (float) (valorTotal - (valorTotal * 0.04));
                    compraVista += valorFinal;

                    System.out.println("Desconto de " + desconto + "%");
                    System.out.printf("Valor final: R$ %.2f\n", valorFinal);

                } else if (formaDePagamento == 3) {

                    float valorFinal = valorTotal;
                    compraParcelada += valorFinal;

                    System.out.printf("Em 2x de R$ %.2f\n", valorFinal / 2);
                    System.out.printf("Valor final: R$ %.2f\n", valorFinal);

                } else if (formaDePagamento == 4) {

                    float valorFinal = (float) (valorTotal + (valorTotal * 0.08));
                    compraParcelada += valorFinal;
                    juros += (valorTotal * 0.08);

                    System.out.printf("Em 4x de R$%.2f\n", valorFinal / 4);
                    System.out.printf("Valor final: R$ %.2f\n", valorFinal);

                } else {
                    System.out.println("Opção Inválida, a compra não será processada");
                }
            }

        } catch (InputMismatchException exception) {
            System.out.println("Atenção!!! Os valores digitados não são números. Tente novamente");
        }

        System.out.printf("\nTotal de compras À vista: R$ %.2f\n", compraVista);
        System.out.printf("Total de compras Parcelada: R$ %.2f\n", compraParcelada);

        System.out.println("                      ");

        System.out.printf("Total de descontos: R$ %.2f\n", descontos);
        System.out.printf("Total de juros: R$ %.2f\n", juros);

        teclado.close();
    }
}
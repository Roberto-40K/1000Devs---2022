package com.mesttra.app.lista2;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

//        Questão 08: Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 5%. Após o
//        aumento, desconte 11% de INSS e 8% de FGTS e o % do IR conforme a tabela abaixo. Imprima o
//        salário inicial, o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS,
//        o desconto do IR e o Total de Descontos (INSS+FGTS+IR). O desconto do Imposto de Renda é
//        variável. Quando o salário do funcionário muda de uma faixa de desconto de IR para outra, ele
//        pode mesmo com o aumento de 5% receber menos do que quando comparado antes do aumento.
//        O seu algoritmo deve calcular e descobrir se o novo salário (5%) fará com que o usuário receba
//        um salário final menor do que antes de aplicar os 5%.
//        Base de Cálculo IR (R$) Alíquota IR (%)
//        Até 1.903,98 0%
//        De 1.903,99 até 2.826,65 7,5%
//        De 2.826,66 até 3.751,05 15%
//        De 3.751,06 até 4.664,68 22,5%
//        Acima de 4.664,68 27,5%
//        PS: No mundo real o percentual é calculado apenas no excedente de cada faixa, mas não se
//        preocupe com isto, faça o calculo simples multiplicando pela alíquota cheia.

public class Questao08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Informe o salário: R$");
        double salarioDoFuncionario = teclado.nextDouble();

        System.out.println("Salário inicial: R$" + salarioDoFuncionario);

        double aumento = salarioDoFuncionario * 1.05f;
        double descontoInss = aumento * 0.11f;
        double desontoFgts = aumento * 0.08f;
        double inss = aumento - aumento * 0.11f;
        double fgts = aumento - aumento * 0.08f;

        System.out.printf("Salário reajustado: R$%.2f\n", aumento);
        System.out.printf("Desconto de 11%% do INSS: R$%.2f\n", descontoInss);
        System.out.printf("Desconto de 8%% do FGTS: R$%.2f\n", desontoFgts);


        if (aumento <= 1903.98) {

            double salarioFinal = Math.abs(aumento - inss - fgts);
            double totalDescontos = descontoInss + desontoFgts;

            System.out.println("Desconto IR: 0%");
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Salário final: R$%.2f", salarioFinal);

        } else if (aumento > 1903.98 && aumento <= 2826.65) {

            double descontoIr = aumento * 0.075;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 7,5%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Salário final: R$%.2f", salarioFinal);

        } else if (aumento > 2826.65 && aumento <= 3751.05) {

            double descontoIr = aumento * 0.15;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 15%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Salário final: R$%.2f", salarioFinal);

        } else if (aumento > 3751.05 && aumento <= 4664.68) {

            double descontoIr = aumento * 0.225;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 22,5%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Salário final: R$%.2f", salarioFinal);

        } else {

            double descontoIr = aumento * 0.275;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 27,5%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Salário final: R$%.2f", salarioFinal);
        }

        teclado.close();
    }
}

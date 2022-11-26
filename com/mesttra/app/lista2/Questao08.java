package com.mesttra.app.lista2;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

//        Quest�o 08: Fa�a um algoritmo para ler o sal�rio de um funcion�rio e aument�-Io em 5%. Ap�s o
//        aumento, desconte 11% de INSS e 8% de FGTS e o % do IR conforme a tabela abaixo. Imprima o
//        sal�rio inicial, o sal�rio com o aumento, o sal�rio final, o desconto do INSS, o desconto do FGTS,
//        o desconto do IR e o Total de Descontos (INSS+FGTS+IR). O desconto do Imposto de Renda �
//        vari�vel. Quando o sal�rio do funcion�rio muda de uma faixa de desconto de IR para outra, ele
//        pode mesmo com o aumento de 5% receber menos do que quando comparado antes do aumento.
//        O seu algoritmo deve calcular e descobrir se o novo sal�rio (5%) far� com que o usu�rio receba
//        um sal�rio final menor do que antes de aplicar os 5%.
//        Base de C�lculo IR (R$) Al�quota IR (%)
//        At� 1.903,98 0%
//        De 1.903,99 at� 2.826,65 7,5%
//        De 2.826,66 at� 3.751,05 15%
//        De 3.751,06 at� 4.664,68 22,5%
//        Acima de 4.664,68 27,5%
//        PS: No mundo real o percentual � calculado apenas no excedente de cada faixa, mas n�o se
//        preocupe com isto, fa�a o calculo simples multiplicando pela al�quota cheia.

public class Questao08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Informe o sal�rio: R$");
        double salarioDoFuncionario = teclado.nextDouble();

        System.out.println("Sal�rio inicial: R$" + salarioDoFuncionario);

        double aumento = salarioDoFuncionario * 1.05f;
        double descontoInss = aumento * 0.11f;
        double desontoFgts = aumento * 0.08f;
        double inss = aumento - aumento * 0.11f;
        double fgts = aumento - aumento * 0.08f;

        System.out.printf("Sal�rio reajustado: R$%.2f\n", aumento);
        System.out.printf("Desconto de 11%% do INSS: R$%.2f\n", descontoInss);
        System.out.printf("Desconto de 8%% do FGTS: R$%.2f\n", desontoFgts);


        if (aumento <= 1903.98) {

            double salarioFinal = Math.abs(aumento - inss - fgts);
            double totalDescontos = descontoInss + desontoFgts;

            System.out.println("Desconto IR: 0%");
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Sal�rio final: R$%.2f", salarioFinal);

        } else if (aumento > 1903.98 && aumento <= 2826.65) {

            double descontoIr = aumento * 0.075;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 7,5%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Sal�rio final: R$%.2f", salarioFinal);

        } else if (aumento > 2826.65 && aumento <= 3751.05) {

            double descontoIr = aumento * 0.15;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 15%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Sal�rio final: R$%.2f", salarioFinal);

        } else if (aumento > 3751.05 && aumento <= 4664.68) {

            double descontoIr = aumento * 0.225;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 22,5%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Sal�rio final: R$%.2f", salarioFinal);

        } else {

            double descontoIr = aumento * 0.275;
            double salarioFinal = Math.abs(aumento - descontoInss - desontoFgts - descontoIr);
            double totalDescontos = descontoInss + desontoFgts + descontoIr;

            System.out.printf("Desconto IR: 27,5%%: R$%.2f\n", descontoIr);
            System.out.printf("Total dos descontos INSS + FGTS + IR: R$%.2f\n", totalDescontos);
            System.out.printf("Sal�rio final: R$%.2f", salarioFinal);
        }

        teclado.close();
    }
}

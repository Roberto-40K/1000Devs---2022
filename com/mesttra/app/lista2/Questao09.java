package com.mesttra.app.lista2;

import java.util.Locale;
import java.util.Scanner;

//        Questão 09: Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar.
//        Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça
//        com que Carlos e André não paguem os centavos, caso os centavos sejam menor ou igual a 30
//        centavos. Caso os centavos sejam maior que 30 centavos, a conta deve ser divida igualmente
//        entre os três.
//        Resultado esperado:

//                Dados Entrada                                        Dados Saída
//        Informe o valor da conta R$: 23                         Carlos pagara: R$ 7.67
//                                                                Andre pagara: R$ 7.67
//                                                                Felipe pagara: R$ 7.67

//        Informe o valor da conta R$: 21                         Carlos pagara: R$ 7.00
//                                                                Andre pagara: R$ 7.00
//                                                                Felipe pagara: R$ 7.00

//        Informe o valor da conta R$: 42.5                       Carlos pagara: R$ 14.00
//                                                                Andre pagara: R$ 14.00
//                                                                Felipe pagara: R$ 14.50

public class Questao09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Informe o valor da conta: R$ ");
        float valorDaConta = teclado.nextFloat();

        System.out.println(" ");

        int amigos = 3;
        float contaRachada = valorDaConta/amigos;

        int inteiro = Math.round(contaRachada);
        float centavos = contaRachada - inteiro;

        if (centavos <= 0.30) {

            System.out.printf("Carlos pagará: R$ %.2f\n", contaRachada - centavos);
            System.out.printf("André pagará: R$ %.2f\n", contaRachada - centavos);
            System.out.printf("Felipe pagará: R$ %.2f\n", contaRachada);

        }else {

            System.out.printf("Carlos pagará: R$ %.2f\n", contaRachada);
            System.out.printf("André pagará: R$ %.2f\n", contaRachada);
            System.out.printf("Felipe pagará: R$ %.2f", contaRachada);

        }

        teclado.close();
    }
}

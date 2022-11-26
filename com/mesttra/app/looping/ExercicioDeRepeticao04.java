package com.mesttra.app.looping;

import java.util.*;

/*
Construa uma função que receba um número inteiro e verifique se o mesmo é primo
e retorne o resultado true para um número primo e false para um número que não seja primo.
 */

public class ExercicioDeRepeticao04 {
    public static boolean numeroEhPrimo(int valorDigitado) {

        for (int numero = 2; numero < valorDigitado; numero++) {

            if (valorDigitado % numero == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        int valorDigitado = teclado.nextInt();

        if (numeroEhPrimo(valorDigitado) == false) {
            System.out.println("Não é um número primo.");
        } else {
            System.out.println("É um número primo.");
        }


        teclado.close();
    }
}





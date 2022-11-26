package com.mesttra.app.looping;

import java.util.*;

/*
Construa uma fun��o que receba um n�mero inteiro e verifique se o mesmo � primo
e retorne o resultado true para um n�mero primo e false para um n�mero que n�o seja primo.
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
            System.out.println("N�o � um n�mero primo.");
        } else {
            System.out.println("� um n�mero primo.");
        }


        teclado.close();
    }
}





package com.mesttra.app.looping;

import java.util.*;

 /*
      Crie um algoritmo que o usuário entre com vários números inteiros e positivos
      e imprima o multiplicação dos números ímpares e a soma dos números pares.
      O algoritmo finaliza quando o usuário digita o número 0.
*/

public class ExercicioDeRepeticao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        int somaPar = 0;
        int multiplicaImpar = 1;
        int numeroUsuario = 1;

        while (numeroUsuario != 0) {
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario % 2 == 0) {
                somaPar += numeroUsuario;

            } else {
                if (numeroUsuario > 0)
                    multiplicaImpar *= numeroUsuario;
            }
        }

        System.out.println("A soma dos números pares é: " + somaPar);
        System.out.println("A multiplicação dos números ímpares é: " + multiplicaImpar);
    }
}

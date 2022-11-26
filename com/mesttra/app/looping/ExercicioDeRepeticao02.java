package com.mesttra.app.looping;

import java.util.*;

 /*
      Crie um algoritmo que o usu�rio entre com v�rios n�meros inteiros e positivos
      e imprima o multiplica��o dos n�meros �mpares e a soma dos n�meros pares.
      O algoritmo finaliza quando o usu�rio digita o n�mero 0.
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

        System.out.println("A soma dos n�meros pares �: " + somaPar);
        System.out.println("A multiplica��o dos n�meros �mpares �: " + multiplicaImpar);
    }
}

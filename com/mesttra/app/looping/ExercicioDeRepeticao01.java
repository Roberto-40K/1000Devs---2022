package com.mesttra.app.looping;

 /*
        Construa um algoritmo que imprima a tabela de equivalência de graus Fahrenheit para centígrados.
        Os limites são de 32 a 200 graus Fahrenheit com intervalo de 1 grau.
*/

public class ExercicioDeRepeticao01 {

    public static void main(String[] args) {

        System.out.println("Fahrenheit              Celsius");

        for (float graus = 32; graus <= 200; graus++) {

            int constante = 32;
            float celsius = (float) ((graus - constante) / 1.8);

            System.out.printf("%.0f                       %.2f%n", graus, celsius);
        }
    }
}

package com.mesttra.app.lista2;

import java.util.Locale;
import java.util.Scanner;

//Questão 10: Faça um algoritmo que leia os dados necessários para calcular e exibir a área:
//        a) de um trapézio. Sabe-se que: A = ((base maior + base menor) * altura)/2 ;
//        b) de um quadrado. Sabe-se que: A = lado * lado;
//        c) de um retangulo. Sabe-se que: A = largura * altura;
//        d) de um círculo. Sabe-se que: A = 3.14 * raio * raio;
//        e) de um triangulo. Sabe-se que: A = (base * altura) / 2;
//        O seu algoritmo deve apresentar ao final da execução qual foi o nome do Objeto com a maior área
//        bem como a área deste objeto.


public class Questao10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("***** ÁREA DO TRAPÉZIO *****");

        System.out.print("Informe a base maior: ");
        int baseMaior = teclado.nextInt();

        System.out.print("Informe a base menor: ");
        int baseMenor = teclado.nextInt();

        System.out.print("Informe a altura: ");
        int altura = teclado.nextInt();

        System.out.println("  ");

        System.out.println("*****ÁREA DO QUADRADO*****");

        System.out.print("Informe o valor de um dos lados: ");
        int lado = teclado.nextInt();

        System.out.println("  ");

        System.out.println("***** ÁREA DO RETÂNGULO *****");

        System.out.print("Informe o valor da largura: ");
        int largura = teclado.nextInt();

        System.out.print("Informe o valor da altura: ");
        int altura1 = teclado.nextInt();

        System.out.println("  ");

        System.out.println("***** ÁREA DO CÍRCULO *****");

        System.out.print("Informe o valor do raio: ");
        int raio = teclado.nextInt();

        System.out.println("  ");

        System.out.println("***** ÁREA DO TRIÂNGULO *****");

        System.out.print("Informe o valor da base: ");
        int base = teclado.nextInt();

        System.out.print("Informe o valor da altura: ");
        int altura2 = teclado.nextInt();

        System.out.println("  ");

        float areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
        System.out.printf("A área do trapézio é: %.2f\n", areaTrapezio);

        float areaQuadrado = lado * lado;
        System.out.printf("A área do quadrado é: %.2f\n", areaQuadrado);

        float areaRetangulo = largura * altura1;
        System.out.printf("A área do retângulo é: %.2f\n", areaRetangulo);

        float areaCirculo = (float) (Math.PI * raio * raio);
        System.out.printf("A área do círculo é: %.2f\n", areaCirculo);

        float areaTriangulo = (base * altura2) / 2;
        System.out.printf("A área do triângulo é: %.2f\n", areaTriangulo);

        System.out.println("  ");

        if (areaTrapezio > areaQuadrado && areaTrapezio > areaRetangulo && areaTrapezio > areaCirculo && areaTrapezio > areaTriangulo) {

            System.out.println("A maior área é o Trapézio com " + areaTrapezio + " de área.");

        } else if (areaQuadrado > areaTrapezio && areaQuadrado > areaRetangulo && areaQuadrado > areaCirculo && areaQuadrado > areaTriangulo) {

            System.out.println("A maior área é o Quadrado com " + areaQuadrado + " de área.");

        } else if (areaRetangulo > areaTrapezio && areaRetangulo > areaQuadrado && areaRetangulo > areaCirculo && areaRetangulo > areaTriangulo) {

            System.out.println("A maior área é o Retângulo com " + areaRetangulo + " de área.");

        } else if (areaCirculo > areaTrapezio && areaCirculo > areaQuadrado && areaCirculo > areaRetangulo && areaCirculo > areaTriangulo) {

            System.out.println("A maior área é o Círculo com " + areaCirculo + " de área.");

        } else {
            System.out.println("A maior área é o Triângulo com " + areaTriangulo + " de área.");
        }

        teclado.close();
    }
}

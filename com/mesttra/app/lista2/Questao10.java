package com.mesttra.app.lista2;

import java.util.Locale;
import java.util.Scanner;

//Quest�o 10: Fa�a um algoritmo que leia os dados necess�rios para calcular e exibir a �rea:
//        a) de um trap�zio. Sabe-se que: A = ((base maior + base menor) * altura)/2 ;
//        b) de um quadrado. Sabe-se que: A = lado * lado;
//        c) de um retangulo. Sabe-se que: A = largura * altura;
//        d) de um c�rculo. Sabe-se que: A = 3.14 * raio * raio;
//        e) de um triangulo. Sabe-se que: A = (base * altura) / 2;
//        O seu algoritmo deve apresentar ao final da execu��o qual foi o nome do Objeto com a maior �rea
//        bem como a �rea deste objeto.


public class Questao10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("***** �REA DO TRAP�ZIO *****");

        System.out.print("Informe a base maior: ");
        int baseMaior = teclado.nextInt();

        System.out.print("Informe a base menor: ");
        int baseMenor = teclado.nextInt();

        System.out.print("Informe a altura: ");
        int altura = teclado.nextInt();

        System.out.println("  ");

        System.out.println("*****�REA DO QUADRADO*****");

        System.out.print("Informe o valor de um dos lados: ");
        int lado = teclado.nextInt();

        System.out.println("  ");

        System.out.println("***** �REA DO RET�NGULO *****");

        System.out.print("Informe o valor da largura: ");
        int largura = teclado.nextInt();

        System.out.print("Informe o valor da altura: ");
        int altura1 = teclado.nextInt();

        System.out.println("  ");

        System.out.println("***** �REA DO C�RCULO *****");

        System.out.print("Informe o valor do raio: ");
        int raio = teclado.nextInt();

        System.out.println("  ");

        System.out.println("***** �REA DO TRI�NGULO *****");

        System.out.print("Informe o valor da base: ");
        int base = teclado.nextInt();

        System.out.print("Informe o valor da altura: ");
        int altura2 = teclado.nextInt();

        System.out.println("  ");

        float areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
        System.out.printf("A �rea do trap�zio �: %.2f\n", areaTrapezio);

        float areaQuadrado = lado * lado;
        System.out.printf("A �rea do quadrado �: %.2f\n", areaQuadrado);

        float areaRetangulo = largura * altura1;
        System.out.printf("A �rea do ret�ngulo �: %.2f\n", areaRetangulo);

        float areaCirculo = (float) (Math.PI * raio * raio);
        System.out.printf("A �rea do c�rculo �: %.2f\n", areaCirculo);

        float areaTriangulo = (base * altura2) / 2;
        System.out.printf("A �rea do tri�ngulo �: %.2f\n", areaTriangulo);

        System.out.println("  ");

        if (areaTrapezio > areaQuadrado && areaTrapezio > areaRetangulo && areaTrapezio > areaCirculo && areaTrapezio > areaTriangulo) {

            System.out.println("A maior �rea � o Trap�zio com " + areaTrapezio + " de �rea.");

        } else if (areaQuadrado > areaTrapezio && areaQuadrado > areaRetangulo && areaQuadrado > areaCirculo && areaQuadrado > areaTriangulo) {

            System.out.println("A maior �rea � o Quadrado com " + areaQuadrado + " de �rea.");

        } else if (areaRetangulo > areaTrapezio && areaRetangulo > areaQuadrado && areaRetangulo > areaCirculo && areaRetangulo > areaTriangulo) {

            System.out.println("A maior �rea � o Ret�ngulo com " + areaRetangulo + " de �rea.");

        } else if (areaCirculo > areaTrapezio && areaCirculo > areaQuadrado && areaCirculo > areaRetangulo && areaCirculo > areaTriangulo) {

            System.out.println("A maior �rea � o C�rculo com " + areaCirculo + " de �rea.");

        } else {
            System.out.println("A maior �rea � o Tri�ngulo com " + areaTriangulo + " de �rea.");
        }

        teclado.close();
    }
}

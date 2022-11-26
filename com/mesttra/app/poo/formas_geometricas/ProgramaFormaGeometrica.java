package com.mesttra.app.poo.formas_geometricas;

public class ProgramaFormaGeometrica {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2, 3);
        System.out.println("ÁREA DO QUADRADO: " + quadrado.calculaArea() + "cm");

        Retangulo retangulo =new Retangulo(7, 9);
        System.out.println("ÁREA DO RETÂNGULO: " + retangulo.calculaArea() + "cm");

        Triangulo triangulo = new Triangulo(2, 3);
        System.out.println("ÁREA DO TRIÂNGULO: " + triangulo.calculaArea() + "cm");

        Circulo circulo = new Circulo(3);
        System.out.printf("ÁREA DO CÍRCULO: %.1fcm%n", circulo.calculaArea());

    }
}

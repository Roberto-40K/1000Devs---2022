package com.mesttra.app.poo.formas_geometricas;

public class ProgramaFormaGeometrica {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2, 3);
        System.out.println("�REA DO QUADRADO: " + quadrado.calculaArea() + "cm");

        Retangulo retangulo =new Retangulo(7, 9);
        System.out.println("�REA DO RET�NGULO: " + retangulo.calculaArea() + "cm");

        Triangulo triangulo = new Triangulo(2, 3);
        System.out.println("�REA DO TRI�NGULO: " + triangulo.calculaArea() + "cm");

        Circulo circulo = new Circulo(3);
        System.out.printf("�REA DO C�RCULO: %.1fcm%n", circulo.calculaArea());

    }
}

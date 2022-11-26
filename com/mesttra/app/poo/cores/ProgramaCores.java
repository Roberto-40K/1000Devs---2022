package com.mesttra.app.poo.cores;

import java.util.*;

public class ProgramaCores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> cores = new ArrayList<>();

        String corAtual;

        do {
            System.out.print("DIGITE UM COR: ");
            corAtual = teclado.next();
            cores.add(corAtual);
        } while (!corAtual.equalsIgnoreCase("preto"));

        System.out.println();

        for (String cor:cores) {
            System.out.println(cor.toUpperCase());
        }

        teclado.close();
    }
}

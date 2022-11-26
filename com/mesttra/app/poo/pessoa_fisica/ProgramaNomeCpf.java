package com.mesttra.app.poo.pessoa_fisica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramaNomeCpf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("Informe o cpf: ");
            String cpf = input.next();

            System.out.print("Informe o nome: ");
            input.nextLine();
            String nome = input.nextLine();

            map.put(cpf, nome);
        }

        for (String nome : map.values()) {
            System.out.println(nome);
        }

        System.out.println("Digite o cpf que deseja excluir: ");
        String cpfExcluido = input.next();

        map.remove(cpfExcluido);

        for (String nome : map.values()) {
            System.out.println(nome);
        }

        input.close();
    }
}

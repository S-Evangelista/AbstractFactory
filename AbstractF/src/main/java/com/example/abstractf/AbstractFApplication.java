
package com.example.abstractf;

import java.util.Scanner;

public class AbstractFApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o esporte que você pratica:");
        System.out.println("1. Futebol");
        System.out.println("2. Volei");
        System.out.print("Digite o número: ");

        int escolha = scanner.nextInt();

        Factory factory;

        if (escolha == 1) {
            factory = new EquipamentosFutebolFactory();
        } else if (escolha == 2) {
            factory = new EquipamentosVoleiFactory();
        } else {
            System.out.println("Opção inválida");
            return;
        }

        Bola bola = factory.criarBola();
        Calcado calcado = factory.criarCalcado();

        System.out.println("Equipamentos criados:");
        bola.confirma();
        calcado.confirma();

    }
}

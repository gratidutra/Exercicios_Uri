package com;

import java.util.Scanner;

public class Ex1118 {
    public static void main(String[] args) {
        double nota, soma = 0;
        int c = 0;
        char decision;

        Scanner tec = new Scanner(System.in);

        decision = tec.nextLine().charAt(0);

        if (decision == 'S') {
            while (c < 2) {
                nota = tec.nextDouble();
                if (nota < 0) {
                    System.out.println("nota invalida");
                } else {
                    c++;
                    soma += nota;
                }
            }
            System.out.println("media = " + soma * 0.5);
            System.out.println("novo calculo 1-sim 2-nao");
        }
    }
}

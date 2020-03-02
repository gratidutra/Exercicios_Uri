package com;

import java.util.Scanner;

public class Ex1134 {
    public static void main(String[] args) {
        int n, c = 1, a = 0, g = 0, d = 0;
        Scanner tec = new Scanner(System.in);

        while (c > 0) {
            n = tec.nextInt();

            if (n == 4) {
                break;
            } else if (n == 1) {
                a++;

            } else if (n == 2) {
                g++;

            } else if (n == 3) {
                d++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
    }
}

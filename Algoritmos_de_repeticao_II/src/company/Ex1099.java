package com;

import java.util.Scanner;

public class Ex1099 {
    public static void main(String[] args) {
        int N;
        int X = 0;
        int Y = 0;
        int soma;
        int num;

        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();

        for ( num = 0; num < N; num++) {
            X = teclado.nextInt();
            Y = teclado.nextInt();
            soma = 0;
            if (X < Y) {
                for (int i = X + 1; i < Y; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            } else {
                for (int i = Y + 1; i < X; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}




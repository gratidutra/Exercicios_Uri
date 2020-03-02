package com;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        int a, b, soma = 0;

        Scanner tec = new Scanner(System.in);

        a = tec.nextInt();
        b = tec.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (i % 13 != 0) {
                    i++;
                    soma += i;
                }
            }
        } else{
            for (int i = b; i <= a; i++) {
                if (i % 13 != 0) {
                    i++;
                    soma +=i;
                }
            }
        }
        System.out.println(soma);
    }
}


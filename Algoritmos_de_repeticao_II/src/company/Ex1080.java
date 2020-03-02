package com;

import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, maior, posicao=0;

        maior = Integer.MIN_VALUE;

        for (int i=1; i<=100; i++) {
            N = input.nextInt();
            if (N > maior) {
                maior = N;
                posicao=i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
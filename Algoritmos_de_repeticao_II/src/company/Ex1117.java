package com;

import java.util.Scanner;

public class Ex1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, soma=0.0;
        int c=0;

        while (c<2) {
            n = input.nextDouble();
            if (n >=0 && n <= 10) {
                c++;
                soma += n;
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = " + soma*0.5);
    }
}

package com;

import java.util.Scanner;

public class Ex1035 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if ((B > C) && (D > A) && ((C + D) > (A + B)) && (C > 0) && (D > 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }
    }
}
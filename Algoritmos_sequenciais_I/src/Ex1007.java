package com.company;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args){
        int A;
        int B;
        int C;
        int D;
        int dif;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        dif = (A*B)-(C*D);
        System.out.println("DIFERENCA = "+ dif);

    }
}

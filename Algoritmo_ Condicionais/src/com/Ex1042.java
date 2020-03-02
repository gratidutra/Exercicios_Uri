package com;

import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args){
        int A;
        int B;
        int C;

        Scanner teclado = new Scanner(System.in);

        A=teclado.nextInt();
        B=teclado.nextInt();
        C=teclado.nextInt();

        if ((A < B) && (A < C) && (B < C)){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        }
        else if ((A < C) && (A < B) && (C < B)){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        }
        else if ((B < A) && (B < C) && (A < C)){
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        }
        else if (B < A && B < C && C < A){
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        }
        else if(C < A && C < B && A < B){
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        }
        else if ((C < A) && (C < B) && (B < A)){
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        }

        System.out.println("\n"+A);
        System.out.println(B);
        System.out.println(C);
        }
}

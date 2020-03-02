package com.company;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args){
        int A;
        int B;
        int C;
        int maiorAB;
        int maior;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        maiorAB=(A+B+Math.abs(A-B))/2;
        maior=(maiorAB+C+Math.abs(maiorAB-C))/2;

        System.out.println(maior+ " eh o maior");
    }
}

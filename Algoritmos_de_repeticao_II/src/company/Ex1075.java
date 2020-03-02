package com;

import java.util.Scanner;

public class Ex1075 {
    public static void main(String[] args) {
        int N;

        Scanner teclado = new Scanner(System.in);

        N=teclado.nextInt();

        for (int i=1; i<=10000; i++){
            if (i % N==2){
                System.out.println(i);
            }
        }
    }
}

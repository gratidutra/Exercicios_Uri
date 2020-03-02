package com;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        int N;
        int A;

        Scanner teclado = new Scanner(System.in);

        N=teclado.nextInt();


        for (int i=0; i<N; i++){
            A=teclado.nextInt();
            if (A%2==0 && A>0){
                System.out.println("EVEN POSITIVE");
            }
            else if(A %2!=0 && A>0){
                System.out.println("ODD POSITIVE");
            }
            else if (A%2==0 && A<0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (A%2!=0 && A<0){
                System.out.println("ODD NEGATIVE");
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}

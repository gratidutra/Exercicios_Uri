package com;

import java.util.Scanner;

public class Ex1078 {
    public static void main(String[] args) {
        int N;
        int contador=1;
        int tab;

        Scanner teclado = new Scanner(System.in);

        N=teclado.nextInt();

        while (contador<=10){
                tab =N*contador;
                System.out.println(contador +" x "+ N + " = " + tab);
                contador++;
            }
        }
    }


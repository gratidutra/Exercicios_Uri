package com;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args){
        double N;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        N = teclado.nextDouble();

    if ( 0<=N & N<=25){
        System.out.println("Intervalo [0,25]");
    }
    else if (25< N && N<=50){
        System.out.println("Intervalo (25,50]");
    }
    else if (50<N && N<=75){
        System.out.println("Intervalo (50,75]");
    }
    else if (75<N && N<=100){
        System.out.println("Intervalo (75,100]");
    }
    else {
        System.out.println("Fora de intervalo");
    }
    }
}

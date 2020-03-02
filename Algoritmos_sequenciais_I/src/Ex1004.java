package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int PROD;
        Scanner teclado = new Scanner(System.in);

        //Realizar leituras de entradas
        a = teclado.nextInt();
        b = teclado.nextInt();

        //Processamento

        PROD = a*b;

        //Apresentar resultados
        System.out.println("PROD = "+PROD); }
}

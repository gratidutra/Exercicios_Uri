package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args){
        int CODIGO1, PECA1;
        int CODIGO2, PECA2;
        double VALOR1;
        double VALOR2;
        double VALOR;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        CODIGO1 = teclado.nextInt();
        CODIGO2 = teclado.nextInt();
        PECA1 = teclado.nextInt();
        PECA2 = teclado.nextInt();
        VALOR1 = teclado.nextDouble();
        VALOR2 = teclado.nextDouble();

        VALOR = VALOR1 * PECA1 + VALOR2 * PECA2;

        System.out.println("VALOR A PAGAR: R$ "+ df.format(VALOR));

    }
}

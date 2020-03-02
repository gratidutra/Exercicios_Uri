package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1005 {
    public static void main (String[] args){
        double A;
        double B;
        double a;
        double b;
        double media;
        ///
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        //Leitura dos valores
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        //
        a = A*3.5/11;
        b = B*7.5/11;
        media = a + b;
        System.out.println("MEDIA = "+df.format(media));

    }
}

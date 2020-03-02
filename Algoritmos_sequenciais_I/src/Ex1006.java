package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args){
        double A;
        double B;
        double C;
        double m;
        double a;
        double b;
        double c;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        //Leitura dos valores
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        //

        a = A*0.2;
        b = B*0.3;
        c = C*0.5;
        m = a + b + c;

        System.out.println("MEDIA = "+df.format(m));


    }
}

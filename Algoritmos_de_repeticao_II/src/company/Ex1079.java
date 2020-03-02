package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        int N;
        double A;
        double B;
        double C;
        double pond;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.0");

        N = teclado.nextInt();

        for (int i = 0; i<N; i++) {
            A = teclado.nextDouble();
            B = teclado.nextDouble();
            C = teclado.nextDouble();
                pond = A * 0.2 + B * 0.3 + C * 0.5;
                System.out.println(df.format(pond));
        }
    }
}



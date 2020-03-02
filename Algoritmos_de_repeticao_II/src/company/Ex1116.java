package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        int n;
        double div, a, b;

        Scanner tec = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("0.0");

        n = tec.nextInt();
        for (int cont = 0; cont < n; cont++) {
            a = tec.nextDouble();
            b = tec.nextDouble();
            if (b == 0) {
                System.out.println("divisao impossivel");

            } else if (a == 0) {
                System.out.println("0.0");
            } else if(a!= 0) {
                div = a / b;
                System.out.println(df.format(div));
            }
        }
    }
}

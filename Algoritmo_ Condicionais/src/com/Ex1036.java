package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args){
        double A;
        double B;
        double C;
        double X1;
        double X2;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        A=teclado.nextDouble();
        B=teclado.nextDouble();
        C=teclado.nextDouble();

        if ((A==0) |(B*B - 4*A*C < 0)){
            System.out.println("Impossivel calcular");
        }
        else{
            X1 = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
            X2 = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
            System.out.println("R1 = " + df.format(X1));
            System.out.println("R2 = " +df.format(X2));
        }
    }
}

package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args){
        double A;
        double B;
        double C;
        double tri;
        double cir;
        double trap;
        double qua;
        double ret;
        double pi;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        pi=3.14159;
        tri= A*C/2;
        cir=pi*C*C;
        trap= (A+B)*C/2;
        qua=B*B;
        ret=A*B;

        System.out.println("TRIANGULO: "+df.format(tri));
        System.out.println("CIRCULO: "+df.format(cir));
        System.out.println("TRAPEZIO: "+df.format(trap));
        System.out.println("QUADRADO: "+df.format(qua));
        System.out.println("RETANGULO: "+df.format(ret));

    }
}

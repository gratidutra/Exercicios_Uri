package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args){
        double x1;
        double y1;
        double x2;
        double y2;
        double distancia;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        x1=teclado.nextFloat();
        y1=teclado.nextFloat();
        x2=teclado.nextFloat();
        y2=teclado.nextFloat();

        distancia=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        System.out.println(df.format(distancia));
    }
}

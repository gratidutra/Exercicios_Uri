package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args){
        double X;
        double Y;
        double consumo;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        X=teclado.nextDouble();
        Y=teclado.nextDouble();

        consumo=X/Y;
        System.out.println(df.format(consumo) + " km/l");
    }
}

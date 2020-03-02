package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args){
        double n;
        double raio;
        double area;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");


        //Entrada dos valores

        raio = teclado.nextDouble();
        n = 3.14159;
        area = n * raio * raio;
        System.out.println("A="+ df.format(area));

    }
}

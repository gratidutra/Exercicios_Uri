package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double raio;
	double pi;
	double area;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        raio = teclado.nextDouble();
        pi=3.14159;
        area = (4/3.0)*pi*raio*raio*raio;

        System.out.println("VOLUME = "+df.format(area));

    }
}

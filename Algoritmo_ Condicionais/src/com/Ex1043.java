package com;

import java.util.Scanner;

public class Ex1043 {
    public static void main(String[] args){
        double a;
        double b;
        double c;
        double per;
        double area;

        Scanner teclado = new Scanner(System.in);

        a=teclado.nextDouble();
        b=teclado.nextDouble();
        c=teclado.nextDouble();

        if((b-c < a & a < b+c & b-c < b+c) & (a-c < b & b < a+c & a-c < a+c) & (a-b < c & c < a+b & a-b < a+b)){
            per = a+b+c;
            System.out.printf("Perimetro = %.1f",per);
        }
        else{
            area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f",area);
        }
    }
}

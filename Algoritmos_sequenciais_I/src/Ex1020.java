package com.company;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args){
        int a;
        int anos;
        int meses;
        int dias;

        Scanner teclado= new Scanner(System.in);

        a= teclado.nextInt();
        anos= a / 356;
        meses=(a % 365) / 30;
        dias=(a % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");





    }
}

package com.company;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args){
        int Km;
        int minutos;
        Scanner teclado = new Scanner(System.in);

        Km = teclado.nextInt();

        minutos = Km*60/30;

        System.out.println(minutos+" minutos");
    }
}

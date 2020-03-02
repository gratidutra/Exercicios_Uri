package com.company;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args){
        int N;
        int horas;
        int minutos;
        int segundos;
        Scanner teclado = new Scanner(System.in);
        //Realizar leituras de entradas
        N= teclado.nextInt();

        horas = N / 3600;
        minutos = (N % 3600)/60;
        segundos = (N % 3600) % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}

package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;


public class Ex1047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dur=0, hora, min;
        String hora1 = br.readLine();
        String min1 = br.readLine();
        String hora2 = br.readLine();
        String min2 = br.readLine();
        int h1 = Integer.parseInt(hora1);
        int m1 = Integer.parseInt(min1);
        int h2 = Integer.parseInt(hora2);
        int m2 = Integer.parseInt(min2);

        int inicio = (h1 * 60) + m1;
        int fim = (h2 * 60) + m2;


        if (inicio >= fim) {
            dur = 1440 - inicio + fim;

        }
        else{
            dur = fim - inicio;
        }
        hora = dur / 60;
        min = dur % 60;
        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + min + " MINUTO(S)");
    }
}
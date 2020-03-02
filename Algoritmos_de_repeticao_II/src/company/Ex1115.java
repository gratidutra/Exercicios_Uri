package com;

import java.util.Scanner;

public class Ex1115 {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner tec = new Scanner(System.in);


        while (true) {
            x = tec.nextInt();
            y = tec.nextInt();
            String value=" ";
            if (x == 0 || y == 0) {
                break;
            } else if (x > 0 && y > 0) {
                value = "primeiro";
            } else if (x > 0 && y < 0) {
                value = "quarto";
            } else if (x < 0 && y > 0) {
                value = "segundo";
            } else if (x < 0 && y < 0) {
                value = "terceiro";
            }
            System.out.println(value);
        }
    }
}

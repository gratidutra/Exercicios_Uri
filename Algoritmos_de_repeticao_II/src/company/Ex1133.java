package com;

import java.util.Scanner;

public class Ex1133 {
    public static void main(String[] args) {
        int a, b;

        Scanner tec = new Scanner(System.in);

        a = tec.nextInt();
        b = tec.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                if (i % 13 != 3) {
                    System.out.println(i);
                }
            }
        }
        else if (a > b){
            for (int i = b + 1; i < a; i++) {
                if (i % 5 == 3 || i % 5 == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}



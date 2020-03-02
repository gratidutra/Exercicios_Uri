package com;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();

            for (int i = 1; i <=n * 4; i += 4) {
                System.out.print(i + " ");
                System.out.print((i + 1) + " ");
                System.out.print(i + 2 + " ");
                System.out.println("PUM");
            }
        }
    }

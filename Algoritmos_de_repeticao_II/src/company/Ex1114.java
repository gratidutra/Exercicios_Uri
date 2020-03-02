package com;

import java.util.Scanner;

public class Ex1114 {
    public static void main(String[] args) {
        int senha = 0;
        
        Scanner tec= new Scanner(System.in);
        
        while (senha != 2002) {
            senha = tec.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        }
    }
}


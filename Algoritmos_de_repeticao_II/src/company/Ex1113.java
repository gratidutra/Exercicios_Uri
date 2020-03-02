package com;

import java.io.BufferedReader;
import java.util.Scanner;

public class Ex1113 {
    public static void main(String[] args) {
        int x = 0,y=0;

        Scanner tec = new Scanner(System.in);

        while(true){
            x=tec.nextInt();
            y=tec.nextInt();
            if(x==y){
                break;
            }
            else{
                if (x<y){
                    System.out.println("Crescente");
                }
                else if (x>y){
                    System.out.println("Decrescente");
                }
            }
        }
    }
}

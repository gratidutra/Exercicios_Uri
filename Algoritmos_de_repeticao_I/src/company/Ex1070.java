package company;

import java.util.Scanner;

public class Ex1070 {
         public static void main(String[] args){
            int a;

            Scanner teclado=new Scanner(System.in);

            a = teclado.nextInt();

            for (int i=a; i<a+12; i++){
                if (i % 2 !=0){
                    System.out.println(i);
                }
            }
         }
    }


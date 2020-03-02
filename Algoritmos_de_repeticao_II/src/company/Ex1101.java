package com;


import java.util.Scanner;

public class Ex1101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M=0, N=0;

        while (true) {
            M = input.nextInt();
            N = input.nextInt();
            int soma=0;

            if (N<=0 || M<=0){
                break;
            }
            else if (M <= N) {
                for (int i=M; i<=N; i++) {
                    System.out.print(i + " ");
                    soma+=i;
                }
                //System.out.println(" Sum=" + soma);
            }
            else if(M>N) {
                for (int i=N; i<=M; i++) {
                    System.out.print(i + " ");
                    soma+=i;
                }
                //System.out.println(" Sum=" + soma);
            }
            System.out.println("Sum=" + soma);
            }
        }
    }



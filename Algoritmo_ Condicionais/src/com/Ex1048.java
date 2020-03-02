package com;

import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args){
        double sal;
        double aum;
        double novo;
        Scanner teclado = new Scanner(System.in);

        sal=teclado.nextDouble();

        if (sal>=0 & sal<=400.00){
            aum = sal*0.15;
            novo = aum+sal;
            System.out.printf("Novo salario: %.2f\n", novo);
            System.out.printf("Reajuste ganho: %.2f\n",aum);
            System.out.println("Em percentual: 15 %");
        }
        else if (sal>=400.01 & sal<=800.00){
            aum = sal*0.12;
            novo = aum+sal;
            System.out.printf("Novo salario: %.2f\n", novo);
            System.out.printf("Reajuste ganho: %.2f\n",aum);
            System.out.println("Em percentual: 12 %");
        }
        else if (sal>=800.01 & sal<=1200.00){
            aum = sal*0.10;
            novo = aum+sal;
            System.out.printf("Novo salario: %.2f\n", novo);
            System.out.printf("Reajuste ganho: %.2f\n",aum);
            System.out.println("Em percentual: 10 %");
        }
        else if (sal>=1200.01 & sal<=2000.00){
            aum = sal*0.07;
            novo = aum+sal;
            System.out.printf("Novo salario: %.2f\n", novo);
            System.out.printf("Reajuste ganho: %.2f\n",aum);
            System.out.println("Em percentual: 7 %");
        }
        else if (sal>2000.00){
            aum = sal*0.04;
            novo = aum+sal;
            System.out.printf("Novo salario: %.2f\n", novo);
            System.out.printf("Reajuste ganho: %.2f\n",aum);
            System.out.println("Em percentual: 4 %");
        }
    }
}

package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1009 {
    public static void main (String[] args){
    String nome;
    double salario;
    double vendas;
    double total;

    Scanner teclado = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    nome = teclado.next();
    salario = teclado.nextDouble();
    vendas = teclado.nextDouble();

    total = salario + (vendas*0.15);

        System.out.println("TOTAL = R$ "+df.format(total));


    }

}

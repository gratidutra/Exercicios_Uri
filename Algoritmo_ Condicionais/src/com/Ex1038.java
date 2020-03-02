package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args){
        int cod;
        int qtd;
        double valor;


        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        cod =teclado.nextInt();
        qtd = teclado.nextInt();

        if (cod == 1){
            valor = qtd*4.00;
            System.out.println("Total: R$ "+ df.format(valor));
        }
        else if (cod == 2){
            valor = qtd*4.50;
            System.out.println("Total: R$ "+ df.format(valor));
        }
        else if (cod == 3){
            valor = qtd*5.00;
            System.out.println("Total: R$ "+ df.format(valor));
        }
        else if (cod == 4){
            valor = qtd*2.00;
            System.out.println("Total: R$ "+ df.format(valor));
        }
        else if (cod == 5){
            valor = qtd*1.50;
            System.out.println("Total: R$ "+ df.format(valor));
        }

    }

}

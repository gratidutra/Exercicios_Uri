package br.com.senacr;

import java.util.Scanner;

public class Problema1008 {
    public static void main(String[] args) {
        //Declaração de variáveis

        int identificador;
        int numeroHoras;
        double valorHora;
        double salario;
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados

        identificador = teclado.nextInt();
        numeroHoras = teclado.nextInt();
        valorHora = teclado.nextDouble();

        //Processamento
        salario = valorHora*numeroHoras;

        //Saída
        System.out.println("NUMBER = "+identificador);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }


}

package com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) throws IOException {

        double N1;
        double N2;
        double N3;
        double N4;
        double exame;
        double mean;
        double meanf;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0");

        String nota1 = br.readLine();
        String nota2 = br.readLine();
        String nota3 = br.readLine();
        String nota4 = br.readLine();
        N1 = Double.parseDouble(nota1);
        N2 = Double.parseDouble(nota2);
        N3 = Double.parseDouble(nota3);
        N4 = Double.parseDouble(nota4);


        mean = N1 * 0.2 + N2 * 0.3 + N3 * 0.4 + N4 * 0.1;

        System.out.println("Media: " + df.format(mean));

        if (mean >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (mean < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if ((mean >= 5.0) && (mean <= 6.9)) {
            System.out.println("Aluno em exame.");

            String exame1 = br.readLine();
            exame = Double.parseDouble(exame1);

            System.out.println("Nota do exame: " + df.format(exame));

            meanf = (mean + exame) * 0.5;
            System.out.println("Aluno aprovado.");
            System.out.println("Media final: " + df.format(meanf));

        }
    }
}
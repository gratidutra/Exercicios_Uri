package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Ex1094 {
    public static void main(String[] args) throws IOException {
        int N;
        double perc = 0, perr=0, pers=0, soma;
        int r = 0;
        int s = 0;
        int c = 0;
        int q= 0;
        String tipo;

        InputStreamReader f = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(f);

        DecimalFormat df = new DecimalFormat("0.00");

        N=Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            tipo = br.readLine();
            String[] tipo1 = tipo.split(" ");
            int tipo2=Integer.parseInt(tipo1[0]);
            q+=tipo2;
            if (tipo1[1].equals("C")) {
                c+=tipo2;

            } else if (tipo1[1].equals("S")) {
                s+=tipo2;

            } else if (tipo1[1].equals("R")) {
                r+=tipo2;
            }
            soma= r+s+c;
            perc = (c/soma)*100;
            perr = (r/soma)*100;
            pers = (s/soma)*100;
        }
        System.out.println("Total: " + q + " cobaias");
        System.out.println("Total de coelhos: "+ c);
        System.out.println("Total de ratos: "+ r);
        System.out.println("Total de sapos: "+ s);
        System.out.println("Percentual de coelhos: "+ df.format(perc) + " % ");
        System.out.println("Percentual de ratos: "+ df.format(perr) + " % ");
        System.out.println("Percentual de sapos: "+ df.format(pers) + " % ");
    }
}

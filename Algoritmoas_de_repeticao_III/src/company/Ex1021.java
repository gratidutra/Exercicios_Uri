package company;

import java.io.*;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String texto = br.readLine();
        String[] fontes = texto.split("[.]");
        int valor = Integer.parseInt(fontes[0]);
        int moedas = Integer.parseInt(fontes[1]);

        ////atribuição variaveis inteiras
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int resto1;
        int resto2;
        int resto3;
        int resto4;
        int resto5;
        int resto6;

        ////MOEDAS
        int ma;
        int mb;
        int mc;
        int md;
        int me;
        int mf;
        int mresto1;
        int mresto2;
        int mresto3;
        int mresto4;
        int mresto5;


        ///NOTAS

        a = valor / 100;
        resto1 = valor % 100;
        b = resto1 / 50;
        resto2 = resto1 % 50;
        c = resto2 / 20;
        resto3 = resto2 % 20;
        d = resto3 / 10;
        resto4 = resto3 % 10;
        e = resto4 / 5;
        resto5 = resto4 % 5;
        f = resto5 / 2;
        resto6 = resto5 % 2;
        g = resto6 % 2;

        //MOEDAS

        ma = moedas / 100;
        mresto1 = moedas % 100;
        mb = mresto1 / 50;
        mresto2 = mresto1 % 50;
        mc = mresto2 / 25;
        mresto3 = mresto2 % 25;
        md = mresto3 / 10;
        mresto4 = mresto3 % 10;
        me = mresto4 / 5;
        mresto5 = mresto4 % 5;
        mf = mresto5 / 1;

        //NOTAS
        System.out.println("NOTAS:");
        System.out.println(a + " nota(s) de R$ 100.00");
        System.out.println(b + " nota(s) de R$ 50.00");
        System.out.println(c + " nota(s) de R$ 20.00");
        System.out.println(d + " nota(s) de R$ 10.00");
        System.out.println(e + " nota(s) de R$ 5.00");
        System.out.println(f + " nota(s) de R$ 2.00");

        ////MOEDAS
        System.out.println("MOEDAS:");
        System.out.println(g +  " moeda(s) de R$ 1.00");
        System.out.println(mb + " moeda(s) de R$ 0.50");
        System.out.println(mc + " moeda(s) de R$ 0.25");
        System.out.println(md + " moeda(s) de R$ 0.10");
        System.out.println(me + " moeda(s) de R$ 0.05");
        System.out.println(mf + " moeda(s) de R$ 0.01");

    }
}

package company;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        int valor;
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

        Scanner tec = new Scanner(System.in);

        valor=tec.nextInt();
        a = valor/100;
        resto1=valor%100;
        b = resto1/50;
        resto2= resto1%50;
        c=resto2/20;
        resto3=resto2%20;
        d=resto3/10;
        resto4=resto3%10;
        e=resto4/5;
        resto5=resto4%5;
        f=resto5/2;
        resto6=resto5%2;
        g=resto6%2;
        System.out.println(valor);
        System.out.println(a +" nota(s) de R$ 100,00");
        System.out.println(b +" nota(s) de R$ 50,00");
        System.out.println(c +" nota(s) de R$ 20,00");
        System.out.println(d +" nota(s) de R$ 10,00");
        System.out.println(e +" nota(s) de R$ 5,00");
        System.out.println(f +" nota(s) de R$ 2,00");
        System.out.println(g +" nota(s) de R$ 1,00");
    }
}

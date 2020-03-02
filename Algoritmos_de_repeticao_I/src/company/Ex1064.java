package company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1064 {
    public static void main (String[] args){
        double A;
        int contador=0;
        double m;
        double soma=0;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        for (int i=0; i<=5; i++){
            A =teclado.nextDouble();
            if (A>0){
                contador++;
                soma = soma+A;
            }
        }
        m = soma/contador;
        System.out.println(contador + " valores positivos");
        System.out.println(df.format(m));
    }
}


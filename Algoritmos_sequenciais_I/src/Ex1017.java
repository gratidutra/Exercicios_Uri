package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args){
        int tempo;
        int velo;
        float km;
        float litros;
     Scanner teclado = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("0.000");
        tempo = teclado.nextInt();
        velo = teclado.nextInt();

      km = (velo*tempo);
      litros = km/12;

      System.out.println(df.format(litros));


    }
}

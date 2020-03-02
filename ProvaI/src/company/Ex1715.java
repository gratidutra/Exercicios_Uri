package company;

import java.util.Scanner;

public class Ex1715 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int M, N, X, Y, j, n, m;
        int aux, aux2;
        int i, i2;

        while (teclado.hasNext()) {
            n = teclado.nextInt();
            m = teclado.nextInt();

            int[] jogadores = new int[m];
            int[] gols = new int[n];

            for (i = 0; i < jogadores.length; i++) {
                jogadores[i] = teclado.nextInt();
            }

            for (i = 0; i < gols.length; i++) {
                gols[i] = teclado.nextInt();
            }


            System.out.printf("%.2f\n", i);
        }
    }
}


package company;

import java.util.Scanner;

public class Forum {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int T;
            double aux;
            int i;

            while (teclado.hasNext()) {
                T = teclado.nextInt();
                double[] tempo = new double[T];
                for (i = 0; i < tempo.length; i++) {
                    tempo[i] = teclado.nextDouble();
                }
                i = 1;
                aux = tempo[0];
                while (i < tempo.length) {
                    if (tempo[i] < aux) {
                        aux = tempo[i];
                    }
                    i++;
                }

                System.out.printf("%.2f\n", aux);
            }
        }

    }


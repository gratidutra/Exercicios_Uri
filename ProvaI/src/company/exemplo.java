package company;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero = 0;
        float min = Float.MAX_VALUE;

        while (true) {
            int vezes = entrada.nextInt();
            for (int i = 0; i < vezes; i++) {
                numero = entrada.nextFloat();
                if (numero >= 9 && numero <= 11) {
                    if (numero < min) {
                        min = numero;
                    }
                }
            }
            System.out.print(min);
        }
    }
}
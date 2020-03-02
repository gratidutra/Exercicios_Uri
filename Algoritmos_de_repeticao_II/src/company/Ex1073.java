package company;

import java.util.Scanner;

public class Ex1073 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            for (int i = 2; i <= numero; i = i + 2) {
                System.out.println(i + "^2 = " + i * i);
            }
        } else {
            numero--;
            for (int i = 2; i <= numero; i = i + 2) {
                System.out.println(i + "^" + numero + " = " + i * i);
            }
        }
    }
}
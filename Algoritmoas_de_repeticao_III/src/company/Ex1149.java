package company;

import java.util.Scanner;

public class Ex1149 {
    public static void main(String[] args) {
        int  n, a, soma = 0;

        Scanner tec = new Scanner(System.in);

        a = tec.nextInt();
        n = tec.nextInt();

        while (n <= 0) {
            n = tec.nextInt();
        }
        for (int i=1; i<n; i++) {
            soma = soma+ a + 1;
        }
        System.out.println(soma);
    }
}
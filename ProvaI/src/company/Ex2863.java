package company;

import java.util.Scanner;

public class Ex2863 {
    public static void main(String[] args) {
        int n=0, corridas;
        int min = Integer.MIN_VALUE;
        Scanner tec = new Scanner(System.in);
        n = tec.nextInt();

        for (int i = 1; i <= n; i++) {
            corridas = tec.nextInt();
            if (corridas <= min) {
                min = corridas;
            }
        }
        System.out.println(min);
    }
}

package company;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        int n, c = 0;
        Scanner tec = new Scanner(System.in);

        while (c >= 0) {
            n = tec.nextInt();
            if (n == 0) {
                break;
            } else if (n > 0) {
                for (int i = 1; i <= n - 1; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(n);
            }
        }
    }
}
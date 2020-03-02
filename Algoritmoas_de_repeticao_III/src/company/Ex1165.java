package company;

import java.util.Scanner;

public class Ex1165 {
    public static void main(String[] args) {
        int n, x;

        Scanner tec = new Scanner(System.in);

        n = tec.nextInt();

        for (int i=0; i<n; i++){
            x = tec.nextInt();
            if (x % 1 == 0 && x % x == 0 && x % 2 !=0) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }

        }
    }
}

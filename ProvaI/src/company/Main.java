package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int A, B, C, val;

        Scanner tec = new Scanner(System.in);


        while (tec.hasNext()) {
            A = tec.nextInt();
            B = tec.nextInt();
            C = tec.nextInt();
            if (A != B && A != C) {
                System.out.println("A");
            } else if (B != A && B != C && A==C) {
                System.out.println("B");
            } else if (C!=B && C!=A && B==A) {
                System.out.println("C");
            } else if (A==B && B==C && C == A) {
                System.out.println("*");
            }
        }
    }
}

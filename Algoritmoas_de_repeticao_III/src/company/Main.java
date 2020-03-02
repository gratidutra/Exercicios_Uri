package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.print((i * i) + " ");
            System.out.println(i * i * i);
        }
    }
}


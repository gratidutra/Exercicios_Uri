package company;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        int n, fat = 1;
        Scanner tec = new Scanner(System.in);

        n = tec.nextInt();

        for (int i = 2; i <= n; i++) {
            fat= fat*i;
        }
        System.out.println(fat);
    }
}

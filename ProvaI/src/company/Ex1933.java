package company;


import java.util.Scanner;

public class Ex1933 {
    public static void main(String[] args) {
        int a, b;
        Scanner tec = new Scanner(System.in);

        a = tec.nextInt();
        b = tec.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else if (b == a) {
            System.out.println();
        }
    }
}


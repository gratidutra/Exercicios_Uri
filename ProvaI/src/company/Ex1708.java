package company;

import java.util.Scanner;

public class Ex1708 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();


        double dif = Y - X;
        double voltas = ((Y / dif));

        double v=Math.ceil(voltas);
        int valor = (int) v;
        System.out.println(valor);
    }
}

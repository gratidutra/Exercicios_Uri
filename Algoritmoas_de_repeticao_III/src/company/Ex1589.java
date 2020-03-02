package company;

import java.util.Scanner;

public class Ex1589 {
    public static void main(String[] args) {
        int n, a, b;

        Scanner tec= new Scanner(System.in);

        n= tec.nextInt();

        for (int i=0; i<n; i++){
            a=tec.nextInt();
            b=tec.nextInt();
            int soma=a+b;
            System.out.println(soma);
        }
    }
}

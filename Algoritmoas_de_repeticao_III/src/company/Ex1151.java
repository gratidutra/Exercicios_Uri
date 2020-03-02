package company;

import java.util.Scanner;

public class Ex1151 {
    public static void main(String[] args) {
        int n, c=1, soma=0;

        Scanner tec= new Scanner(System.in);

        n= tec.nextInt();
        for (int i=0; i<n; i++){
            System.out.print(i+" ");
            System.out.print(i+c+" ");
        }
    }
}

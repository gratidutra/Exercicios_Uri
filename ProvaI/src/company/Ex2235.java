package company;

import java.util.Scanner;

public class Ex2235 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner tec = new Scanner(System.in);
        a=tec.nextInt();
        b=tec.nextInt();
        c=tec.nextInt();
        int somaab=a+b;
        int somabc=b+c;
        int somaac=a+c;
        int soma = a+b+c;

        if(a==b){
            System.out.println("S");
        }
        else if (a==c){
            System.out.println("S");
        }
        else if(b==c){
            System.out.println("S");
        }
        else if(soma==0){
            System.out.println("S");
        }
        else if (somaab == c){
            System.out.println("S");
        }
        else if (somabc==a){
            System.out.println("S");
        }
        else if (somaac==b){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
    }
}

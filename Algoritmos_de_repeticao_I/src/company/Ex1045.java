package company;

import java.util.Scanner;

public class Ex1045 {
        public static void main(String[] args){
            double a;
            double b;
            double c;

            Scanner teclado = new Scanner(System.in);

            a=teclado.nextDouble();
            b=teclado.nextDouble();
            c=teclado.nextDouble();

            if(a >= b + c){
                System.out.println("NAO FORMA TRIANGULO");
            }
            //Retangulo
            else if (a*a == b*b + c*c ){
                System.out.println("TRIANGULO RETANGULO");

                if(a==b | b==c | a==c ) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            //Obtusangulo
            else if (a*a > b*b + c*c){
                System.out.println("TRIANGULO OBTUSANGULO");
                if(a==b | b==c | a==c ) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
            //acutangulo
            else if (a*a < b*b + c*c){
                System.out.println("TRIANGULO ACUTANGULO");

                if (a==b & b==c & c==a){
                    System.out.println("TRIANGULO EQUILATERO");}

                else if(a==b | b==c | a==c ){
                    System.out.println("TRIANGULO ISOSCELES");}
                else{
                    System.out.println();
                }
            }
        }
    }


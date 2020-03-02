package company;
//consegui submeter com codigo da internet

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Ex1043 {
    public static void main(String[] args) throws IOException {
        double A;
        double B;
        double C;
        double per;
        double area;

        Scanner teclado = new Scanner(System.in);

        A=teclado.nextDouble();
        B=teclado.nextDouble();
        C=teclado.nextDouble();

        if(((abs(B - C) < A) & (A < B + C)) & ((abs(A - C) < B) & (B < A + C)) & ((abs(A - B) < C) & (C < A + B))){
            per = (A+B+C);
          System.out.printf("Perimetro = %.1f",per);
        }
        else{
            area=(((A + B) * C)/2);
            System.out.printf("Area = %.1f",area);
        }
    }
}

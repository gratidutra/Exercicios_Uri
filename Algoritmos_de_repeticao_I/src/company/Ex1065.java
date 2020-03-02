package company;

import java.util.Scanner;

public class Ex1065 {
    public static void main(String[] args){
        double A;
        int contador=0;

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<=4; i++){
            A =teclado.nextDouble();
            if (A% 2 == 0){
                contador++;
            }
        }
        System.out.println(contador + " valores pares");
    }
}


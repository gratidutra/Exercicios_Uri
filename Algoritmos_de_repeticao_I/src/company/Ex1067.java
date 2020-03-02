package company;

import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args){
        int contador=0;
        int limite;

        Scanner teclado=new Scanner(System.in);

        limite = teclado.nextInt();

        while (contador<=limite){
            if (contador % 2 !=0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}

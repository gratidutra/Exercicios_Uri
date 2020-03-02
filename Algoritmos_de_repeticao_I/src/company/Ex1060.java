package company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex1060 {
    public static void main(String[] args){
        double A;
        int contador=0;

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<=5; i++){
            A =teclado.nextDouble();
            if (A>0){
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
    }
}

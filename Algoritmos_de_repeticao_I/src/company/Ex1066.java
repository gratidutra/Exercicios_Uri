package company;

import java.util.Scanner;

public class Ex1066 {
    public static void main(String[] args){
        int A;
        int par=0;
        int impar=0;
        int positivo=0;
        int negativo=0;

        Scanner teclado=new Scanner(System.in);

        for (int i=0; i<=4; i++ ){
            A= teclado.nextInt();

            if (A % 2==0){
                par++;
            }
            else {
                impar++;
            }
            if(A > 0){
                positivo++;
            }
            if(A < 0){
                negativo++;
            }
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");

    }
}

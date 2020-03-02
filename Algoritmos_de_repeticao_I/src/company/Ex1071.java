package company;

import java.util.Scanner;

public class Ex1071 {
    public static void main (String[] args){
        int contador=0;
        int base;
        int limite;

        Scanner teclado = new Scanner(System.in);

        base=teclado.nextInt();
        limite=teclado.nextInt();

        if(base<limite){
        for(int i= base + 1; i < limite; i++){
            if (i % 2 != 0){
                contador=contador+i;
                }
            }
            System.out.println(contador);
        }
        else if (base>limite ){
            for (int i = limite + 1; i < limite; i++){
                if (i % 2 != 0){
                    contador = contador+i;
                }
            }
        }
        System.out.println(contador);
    }
}

package company;

import java.util.Scanner;

public class Ex1050 {
    public static void main(String[] args){
        int a;
        int b;

        Scanner teclado= new Scanner(System.in);

        a = teclado.nextInt();

        if (a==61){
            System.out.println("Brasilia");
        }
        else if (a==71){
            System.out.println("Salvador");
        }
        else if (a==11){
            System.out.println("São Paulo");
        }
        else if (a==21){
            System.out.println("Rio de Janeiro");
        }
        else if (a==32){
            System.out.println("Juiz de Fora");
        }
        else if (a==19){
            System.out.println("Campinas");
        }
        else if (a==27){
            System.out.println("Vitoria");
        }
        else if (a==31){
            System.out.println("Belo Horizonte");
        }
        else{
            System.out.println("DDD nao cadastrado");
        }
    }
}

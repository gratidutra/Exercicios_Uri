package company;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        System.out.println(" - Informe o valor de N! - ");
        int tam = input.nextInt();

        String nome[] = new String[tam];
        int idade[] = new int[tam];
        String sexo[] = new String[tam];

        for ( i = 0; i < nome.length; i++){
            System.out.println(" - Informe o nome da " + (i+1) + "º pessoa");
            nome[i] = input.nextLine();
        }

        for ( i = 0; i < idade.length; i++){
            System.out.println(" - Informe a idade da " + (i+1) + "º pessoa");
            idade[i] = input.nextInt();
        }
        for ( i = 0; i < sexo.length; i++){
            System.out.println(" - Informe o sexo da " + (i+1) + "º pessoa");
            sexo[i] = input.nextLine();
        }
    }
}

package company;

import java.util.Scanner;

public class Ex2930 {
    public static void main(String[] args) {
        int inicio, fim, prazo;

        Scanner tec = new Scanner(System.in);

        inicio = tec.nextInt();
        fim = tec.nextInt();
        int soma = inicio+3;
        prazo = 24;

        if (fim < inicio || fim > prazo) {
            System.out.println("Eu odeio a professora!");
        } else if (fim <= soma && fim <= 21) {
            System.out.println("Muito bem! Apresenta antes do Natal!");
        } else if (fim >= 22 && fim >= inicio ) {
            System.out.println("Parece o trabalho do meu filho!");
            if (fim < 23 && fim !=inicio) {
                System.out.println("TCC Apresentado!");
            } else {
                System.out.println("Fail! Entao eh nataaaaal!");
            }
        }
    }
}


package company;

import java.util.Scanner;

public class Ex1715b {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int qjog, qgol, count = 0;
        int i = 0, j = 0;


        int jogo[][] = new int[qjog = teclado.nextInt()][qgol = teclado.nextInt()];

        for (i = 0; i < qjog; i++) {
            for (j = 0; j < qgol; j++) {

                System.out.println("Digite o status do jogador:");
                jogo[i][j] = teclado.nextInt();

                System.out.println("jogador "+ (i+1) + " fez "+ j+" gols.");
            }
        }

    }
}






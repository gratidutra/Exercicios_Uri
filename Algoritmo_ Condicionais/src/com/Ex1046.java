package com;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args){
        int inicio;
        int fim;
        int duracao;

        Scanner teclado = new Scanner(System.in);

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if (inicio > fim | fim == inicio ){
            duracao = 24-inicio+fim;
            System.out.println("O JOGO DUROU "+ duracao+" HORA(S)");
        }
        else if (fim > inicio){
            duracao = fim-inicio;
            System.out.println("O JOGO DUROU "+ duracao+" HORA(S)");
        }
        }
}

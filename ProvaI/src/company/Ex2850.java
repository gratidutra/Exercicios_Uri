package company;

import java.util.Scanner;

public class Ex2850 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome, perna=null;

        while(tec.hasNext()) {
            nome = tec.nextLine();
            if (nome.equals("esquerda")) {
                perna = "ingles";
            } else if (nome.equals("direita")) {
                perna = "frances";
            } else if (nome.equals("nenhuma")) {
                perna = "portugues";
            } else if (nome.equals("as duas")) {
                perna = "caiu";
            }
            System.out.println(perna);
        }

    }
}
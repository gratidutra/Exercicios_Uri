package company;

import java.util.Scanner;

public class Ex11471b {

    public static void main(String[] Args) {
        Scanner tec = new Scanner(System.in);
        int x, y, i, d = 0, j = 1;
        String soma = "";


        while (tec.hasNext()) {
            x = tec.nextInt();
            y = tec.nextInt();

            for (i = 1; i < y; i++) {
                d = tec.nextInt();

                if (x == y) {
                    System.out.print("*\n");
                } else {
                   for(j=1; j<=x; j++) {
                        if (j == d){
                            continue;
                            System.out.print(j+ " ");
                        }

                    }
                }
            }
        }
        }
    }
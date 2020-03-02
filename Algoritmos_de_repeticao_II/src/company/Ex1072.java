package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int N;
		int x;
		int contadorin = 0;
		int contadorout = 0;


		Scanner teclado = new Scanner(System.in);
         N=teclado.nextInt();

		for (int i = 0; i < N; i++) {
			x = teclado.nextInt();
			if (x <= 20 && x >= 10) {
				contadorin++;
			} else {
				contadorout++;
			}
		}
		System.out.println(contadorin + " in");
		System.out.println(contadorout + " out");
	}
}

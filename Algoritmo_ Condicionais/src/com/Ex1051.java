package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex1051 {
    public static void main(String[] args) throws IOException {
        double a;
        double imposto;
        double dif;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String v = br.readLine();
        a = Integer.parseInt(v);

        if (a >= 0.00 & a <= 2000.00) {
            System.out.println("Isento");
        }
        else if (a >= 2000.01 & a <= 3000.00) {
            dif = a - 2000.00;
            imposto = dif * 0.08;
            System.out.printf("R$ %.2f \n",imposto);
        }
        else if (a >= 3000.01 & a <= 4500.00) {
            imposto = 1000 * 0.08;
            dif = a - 3000.00;
            imposto = imposto + dif * 0.18;
            System.out.printf("R$ %.2f \n",imposto);
        }
        else if (a > 4500.00) {
            imposto = 1000 * 0.08 + 1500 * 0.18;
            dif = a - 4500.00;
            imposto = imposto + dif * 0.28;
            System.out.printf("R$ %.2f \n",imposto);
        }
    }
}
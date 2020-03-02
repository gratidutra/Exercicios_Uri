package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1147c {
    public static void main(String[] args) throws IOException {
        String linha1 = "";
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

        while ((linha1 = tec.readLine()) != null) {
            String[] vetor1 = linha1.split(" ");

            int mergulhadores = Integer.parseInt((vetor1[0]));
            int voltam = Integer.parseInt(vetor1[1]);
            String codigos = tec.readLine();

            if (mergulhadores == voltam) {
                System.out.println("*");
            } else {
                String[] vetor2 = codigos.split(" ");

                for (int i = 1; i <= mergulhadores; i++) {
                    if (!Arrays.asList(vetor2).contains(String.valueOf(i))) {
                        System.out.print(i + " ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}

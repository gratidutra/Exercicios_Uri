package company;

import javax.script.ScriptEngineManager;
import java.util.Scanner;

public class Ex1564 {
    public static void main(String[] args) {
        int n;
        Scanner tec = new Scanner(System.in);

        while (tec.hasNext()) {
            n = tec.nextInt();
            if (n == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }
    }
}
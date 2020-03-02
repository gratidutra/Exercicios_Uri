package company;
import java.util.Scanner;


public class Ex2234 {
    public static void main(String[] args){
        double a, b;
        Scanner tec = new Scanner(System.in);

        a = tec.nextDouble();
        b = tec.nextDouble();

        double div = a/b;
        System.out.printf("%.2f\n",div);

    }
}

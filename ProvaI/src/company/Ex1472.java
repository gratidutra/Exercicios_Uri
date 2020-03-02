package company;

import java.util.Scanner;

public class Ex1472 {
    public static void main(String[] args) {
        double npontos, comp, soma = 0, r, ltri, atri, acir, pi = 3, numero;

        Scanner tec = new Scanner(System.in);
    ///PARTE I E II

        npontos = tec.nextInt();
        for (int i = 0; i < npontos; i++) {
            comp = tec.nextInt();
            soma += comp;
        }
    //PARTE III

        System.out.println("circ total " +soma);
        r = (soma/(2*pi));
        System.out.println("raio "+ r);

    //PARTE IV

        ltri = r*(Math.sqrt(3)); ///okk
        System.out.println("lado "+ ltri);
        atri = ((ltri*ltri)*Math.sqrt(3))/4; // okkk

    // PARTE V

        acir = pi*r*r;
        System.out.println("a cir "+acir);
        System.out.println("a tri "+atri);
    //PARTE VI

        numero = acir/atri;
        System.out.println(numero);
        int result = (int) numero;
        System.out.println(result);

    }
}

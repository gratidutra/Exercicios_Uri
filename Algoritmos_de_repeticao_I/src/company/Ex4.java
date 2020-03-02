package company;

import java.util.Scanner;

public class Ex4 {
           public static void main(String[] args) {
            // Variáveis
            int base;
            int limite;
            int contador=0;
            String saida = "";

            Scanner entrada = new Scanner(System.in);

            //Entrada de dados
            base = entrada.nextInt();
            limite = entrada.nextInt();

            //Processamento
            while(base <= limite){
                if(base % 2 != 0){
                    if(contador>0) {
                        saida += " " + base;
                    }else{
                        saida += base;
                    }
                    contador++;
                    base++;
                }
                base++;
            }

            System.out.println("Antes: "+saida);
            System.out.print("Depois: "+saida.replaceAll(" ",","));
            System.out.println(".");
            //String novaSaida = saida.substring(0,saida.length()-2);
            //System.out.println(novaSaida+".");
            System.out.println("Total: "+contador);

        }
    }


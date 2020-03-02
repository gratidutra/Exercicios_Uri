package com;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args){
        String A;
        String B;
        String C;

        Scanner teclado = new Scanner(System.in);

        A = teclado.next();
        B = teclado.next();
        C = teclado.next();

        if(A == "vertebrado"){
            if (B=="ave"){
                if (C=="carnivoro"){
                    System.out.println("aguia");}
                else if(C=="onivoro"){
                        System.out.println("pomba");
                    }}
             else if (B=="mamifero"){
                     if (C=="onivoro"){
                    System.out.println("homem");
                }
                     else if (C=="herbivoro"){
                    System.out.println("vaca");
                }
                    }
                }
        else if(A=="invertebrado"){
            if (B=="inseto"){
                if (C=="hematofago"){
                    System.out.println("pulga");
                }
                else if(C=="herbivoro"){
                    System.out.println("lagarta");
                }
            }
            else if(B=="anelideo"){
                if (C=="hematofago"){
                    System.out.println("sanguessuga");
                }
                else if (C=="onivoro"){
                    System.out.printf("minhoca\n");
                }
            }
        }
            }
        }


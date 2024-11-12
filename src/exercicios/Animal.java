package exercicios;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String p1 = ler.nextLine();
        String p2 = ler.nextLine();
        String p3 = ler.nextLine();
//

        if(p1.equalsIgnoreCase("vertebrado") ){

            if (p2.equalsIgnoreCase("mamifero")){

                if (p3.equalsIgnoreCase("onivoro")){
                        System.out.println("homem");
                }else {
                        System.out.println("vaca");
                }

            }else {
                if (p3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else {
                    System.out.println("pomba");
                }
            }
        }else {
            if (p2.equalsIgnoreCase("inseto")){
                if (p3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else {
                    System.out.println("lagarta");
                }
            }else {
                if (p3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else {
                    System.out.println("minhoca");
                }
            }
        }



    }
}

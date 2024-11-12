package Oexception.runtime.test;

import java.io.IOException;
import java.util.Scanner;

public class RuntimeExeptionTest04 {
    public static  Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        ler2num();


    }

    public static void  ler2num(){
        try{
            System.out.println("Digite os numeros");
            int a = ler.nextInt();
            int b = ler.nextInt();
            if (b == 0){
                throw new IllegalArgumentException("No pode meo");
            }

        }catch (IllegalArgumentException e){
            System.out.println("Voce não pode fazer issoã");
            ler2num();

        }




    }

    public static int somar(int i, int s) {
        if (s == 0){
            throw new IllegalArgumentException("Não se pode fazer isso meo");
        }
        return s + i;
    }
}

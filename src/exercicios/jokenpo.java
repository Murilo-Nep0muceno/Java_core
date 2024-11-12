package exercicios;

import java.util.Random;
import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {


        Random number = new Random();

        int numero1 =number.nextInt(3) +1;

        Scanner ler = new Scanner(System.in);

        int jogo = ler.nextInt();

        for (int i = numero1; i != jogo ; ){
          ler = new Scanner(System.in);
          if (i != jogo){
              System.out.println( numero1);
          }


        }
    }
}

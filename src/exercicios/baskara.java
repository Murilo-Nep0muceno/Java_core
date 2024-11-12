package exercicios;

import java.util.Scanner;
public class baskara {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double A, B, C, Delta;
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        Delta = (B*B) - 4*A*C;
       double raiz1 = (-B + Math.sqrt(Delta))/ (2  * A);
        double raiz2 = (-B - Math.sqrt(Delta))/ (2  * A);



       if(Delta > 0){
        if ( A == 0  ) {
            System.out.printf("Impossivel calcular");
        }else {
           System.out.printf("R1 = %.5f\n", raiz1);
           System.out.printf("R2 = %.5f\n", raiz2);
    }
        }else if(Delta == 0 ){
           System.out.printf("Impossivel calcular");
       }else {
           System.out.println("Impossivel calcular" );
       }


    }
}

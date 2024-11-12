package exercicios;

import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sal = ler.nextDouble();
        double sum = 0.00;
        if (sal > 4500){
            double imposto = (1000 * 0.08) + (1500 * 0.18);
            double dif = sal - 4500;
            imposto += dif * 0.28;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if(sal <= 4500 && sal >= 3001 ){
            double imposto = (1000* 0.08);
            double dif = sal - 3000;
            imposto += dif *0.18;
            System.out.printf("R$ %.2f\n", imposto);

        }else if(sal >= 2001 && sal <= 3000){
            double n1 = sal -2000;
             sum += n1 * 0.08;


            System.out.printf( "R$ %.2f\n",sum );
        }else {
            System.out.println("Isento");
        }
    }
}

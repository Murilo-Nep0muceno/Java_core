package exercicios;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double perimetro = A + B + C;
        double area = (A+B)*C/2;

        if (A < B + C && B < A + C && C < A + B)  {
            System.out.printf("Perimetro = %.1f\n", perimetro );
        }else {
            System.out.printf("Area = %.1f\n", area );
        }

    }
}

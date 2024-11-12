package beecrowd;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double triangulo = A * C / 2;
        double circulo = (C * C) * 3.14159;
        double trapezio = 0.5 * C * (A + B);
        double quadrado = B * B;
        double retangulo = A* B;
        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quadrado);
        System.out.printf("RETANGULO: %.3f\n",retangulo);

    }


}

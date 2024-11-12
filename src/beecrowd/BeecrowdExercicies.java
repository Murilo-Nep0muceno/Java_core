package beecrowd;

import java.util.Scanner;

public class BeecrowdExercicies {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        double R = n1.nextDouble();
        double Esfera = (4.0/3)* 3.14159 * Math.pow(R,3) ;
        System.out.printf("VOLUME = %.3f\n" , Esfera);

    }
}

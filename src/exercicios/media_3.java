package exercicios;

import java.util.Scanner;

public class media_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1 = ler.nextFloat();
        float n2 = ler.nextFloat();
        float n3 = ler.nextFloat();
        float n4 = ler.nextFloat();
        float mediaP = (2 *n1+ 3 *n2+4 * n3+ 1* n4)/(2+3+4+1);
        if (mediaP >= 7){
            System.out.printf("Media: %.1f\n" , mediaP);
            System.out.println("Aluno aprovado.");
        }
          else if ( mediaP < 5){
                System.out.printf("Media: %.1f\n" , mediaP);
                System.out.println("Aluno reprovado.");
            }
          else {

                System.out.printf("Media: %.1f\n" , mediaP);
                System.out.println("Aluno em exame");
                float notaE = ler.nextFloat();
                float novaM = (mediaP + notaE) / 2;
                System.out.println("Nota do exame: " + notaE);

                if (novaM>= 5){

                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + novaM);
                }else {
                    System.out.println("Aluno reprovado.");
                    System.out.println("Media final: " + novaM);
                }

            }






    }
}

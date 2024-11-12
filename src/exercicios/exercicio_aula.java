package exercicios;

import java.util.Scanner;

public class exercicio_aula {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int op = ler.nextInt();
        int qtd = 0;

        switch(op ){
            case 1:

               qtd = ler.nextInt();
               double total = qtd * 4 ;
               System.out.printf("Total: R$ %.2f \n" ,  total);
               break;
            case 2:

                qtd = ler.nextInt();
                 total = qtd * 4.5 ;
                System.out.printf("Total: R$ %.2f \n" ,  total);
                break;
            case 3:

                qtd = ler.nextInt();
                 total = qtd * 5 ;
                System.out.printf("Total: R$ %.2f \n" ,  total);
                break;
            case 4:

                qtd = ler.nextInt();
                total = qtd * 2 ;
                System.out.printf("Total: R$ %.2f \n" ,  total);
                break;
            case 5:

                qtd = ler.nextInt();
                total = qtd * 1.5 ;
                System.out.printf("Total: R$ %.2f \n" ,  total);
                break;

            default:
                System.out.println("Insira um codigo valido");
                break;
        }

    }
}

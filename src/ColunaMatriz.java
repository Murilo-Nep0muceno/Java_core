
import java.util.Locale;
import java.util.Scanner;

public class ColunaMatriz {
    public static void main(String[] args) {

        // Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double soma = 0;
        int C = ler.nextInt();
        char T = ler.next().toUpperCase().charAt(0);

        double[][] M = new double[3][3];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                M[i][j] = ler.nextDouble();

            }
        }

        for (int j = 0; j < M.length; j++) {
            soma += M[j][C];

        }

        //if (T == 'M') {
        //	soma /= M.length;
        System.out.println(String.format("%.1f",soma));
    }




}
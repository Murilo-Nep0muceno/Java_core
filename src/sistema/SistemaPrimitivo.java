package sistema;

import sistema.cadastro.CadastroPessoa;

import java.util.Scanner;

public class SistemaPrimitivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CadastroPessoa dataBase = new CadastroPessoa();
        int op = 0;


        while (op != 5) {
            op = input.nextInt();
            String nome = "";
            String senha = "";
            String login = "";
            String []resultArray = dataBase.Cadastro(nome, login, senha );

            switch (op) {

                case 1:
                    System.out.println("Caso 1");
                    nome = input.next();
                    senha = input.next();
                    login = input.next();
                    System.out.println("Fim caso 1");

                    break;
                case 3:
                    System.out.println("Caso 3");

                    for (String i : resultArray) {
                        System.out.println(i);
                    }
                    System.out.println(nome);
                    System.out.println("Fim caso 3");

                    break;
                case 4:
                    System.out.println("3");
                    break;
                case 5:
                    System.out.println("5");
                    break;


            }
        }


    }
}
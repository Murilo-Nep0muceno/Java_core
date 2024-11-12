package Banco.dominio;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {


        ContaPessoa conta = new ContaPessoa();
        ImprimirDados imprimi = new ImprimirDados();
        ValidaçãoDados validacao = new ValidaçãoDados();
        FuncoesBanco fucoes = new FuncoesBanco();

        Scanner input = new Scanner(System.in);
        String apresentação = "\n--------Seja Bem Vindo-------- \n" +
                " \nBANCO OURO\n\n" +
                "Escolha 1 Opção abaixo\n" +
                "1- Cadastro  \n" +
                "2- Login \n" +
                "3- Sair do programa\n" +
                "Digite a Opção: ";

//        System.out.println(apresentação);

        int op = 0;

        while (op != 3) {
            System.out.println(apresentação);
            op = input.nextInt();

            switch (op) {
                case 1:
                    fucoes.cadastroFuc();
                    break;

                case 2:
                    System.out.println("Opção Login");

                    int numeroConta = input.nextInt();
                    String pessoa = input.next();
                    int senha = input.nextInt();

                    fucoes.loginFuc(numeroConta,pessoa,senha);

                    if (fucoes.loginFuc(numeroConta,pessoa,senha)) {

                        System.out.println("Acesso Permitido");
                        fucoes.imprimirFuc();

                        while (op != 4) {
                            op = input.nextInt();

                            switch (op) {

                                case 1:
                                    double retirar = input.nextDouble();

                                    fucoes.sacarDinheiro(conta.saldo, retirar);
                                    break;

                                case 2:
                                    System.out.println("Deposito dinheiro em conta: R$ " + conta.saldo);
                                    conta.saldo += input.nextDouble();
                                    System.out.println("Valor Depositado na sua conta: R$" + conta.saldo);
                                    
                                    break;

                                case 3:


                                    break;

                                case 4:
                                    System.out.println("Saindo Do Sistema");
                                    break;

                            }

                        }


                    } else {
                        imprimi.imprimir(conta);
                        System.out.println("Acesso Negado");
                        System.out.println(validacao.nome(conta));
                        System.out.println(pessoa);
                    }

                    break;

                case 3:
                    System.out.println("Saindo... \n obrigado por usar");
                    break;

                default:
                    System.out.println("Insira uma opção valida");
                    break;
            }
        }
    }
}


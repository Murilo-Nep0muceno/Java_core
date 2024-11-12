package Banco.dominio;

import java.util.Scanner;

public class FuncoesBanco {






    ContaPessoa conta = new ContaPessoa();

    public void imprimirFuc() {
        System.out.println("1- Sacar \n" +
                "2- Depositar \n" +
                "3- Deslogar\n" +
                "4- Sair Programa \n");
    }

    public boolean sacarDinheiro(double saldo, double dinheiro) {
        if (saldo < dinheiro) {
            System.out.println("Não foi possivel realizar a transação\n valor em conta: R$ " + conta.saldo);

            return false;
        }

        conta.saldo =  saldo - dinheiro;
        System.out.println("Dinheiro Sacado " + dinheiro + "\n valor em conta: R$ " + conta.saldo);

        return true;
    }

    public boolean loginFuc(int numeroConta, String pessoa, int senha) {
        ValidaçãoDados validacao = new ValidaçãoDados();

        if (validacao.nome(conta).equals(pessoa) && validacao.numeroConta(conta) == numeroConta && validacao.senha(conta) == senha) {
            return true;

        }
        return false;
    }

    public void cadastroFuc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Opção Cadastro ");

        System.out.println("Numero da Conta");
        conta.numeroConta = input.nextInt();

        System.out.println("Nome Completo");
        conta.pessoa = input.next();

        System.out.println("Senha Cadastrada");
        conta.senha = input.nextInt();

        System.out.println("Cadastro Realizado" + conta.senha);
    }

}

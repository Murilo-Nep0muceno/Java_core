package exercicios.test;

import exercicios.funcionario.Funcionario;
import exercicios.funcionario.Porcentagem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class   Cafeteria {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Funcionario> funcionarios;
    public static void main(String[] args) {
        funcionarios= new ArrayList<>();
        menu();
    }

    public static void menu(){
        System.out.println("----- Cafeteria Randandan -----");
        System.out.println("|     1-Cadastrar Funcionario     |");
        System.out.println("|     2-Demitir Funcionario       |");
        System.out.println("|     3-Aumentar Salario          |");
        System.out.println("|     4-Trocar de cargo           |");
        System.out.println("|     5-Encerrar sessão           |");

        int op = input.nextInt();

        switch (op){
            case 1:
                cadastroFuncionario();
                break;
            case 2:
                demitirFuncionario();
                break;
            case 3:
                aumentarSalario();
                break;
            case 4:
                trocaCargo();
                break;
            case 5:
                System.out.println("Encerrando programa");
                System.exit(0);
            default:
                System.out.println("Nenhuma Opção selecionada");
                menu();
                break;
        }

    }

    public static void cadastroFuncionario() {
        System.out.println("Cadastro de Funcionarios");
        System.out.println("Nome: ");
        String nome = input.next();
        System.out.println("Salario: ");
        String salario = input.next();

        System.out.println("Funções Disponiveis: ");

        for (Porcentagem p : Porcentagem.values()){
            System.out.println( p.getID() +": " +p.name());

        }

        System.out.println("Digite qual Cargo voce deseja: ");
        int id = input.nextInt();


        Porcentagem valor = Porcentagem.fromId(id);

            Funcionario funcionario = new Funcionario( nome, salario, valor );
            funcionarios.add(funcionario);
            System.out.println("Funcionario: "+funcionario.getNome());
            System.out.println("Cargo: "+funcionario.getPorcentagem());

            menu();

        System.out.println("Digite sua opção");

    }

    public static void demitirFuncionario(){

        if (funcionarios.size() > 0){

            System.out.println("Funcionarios Cadastrados");

            for (Funcionario f : funcionarios) {
                System.out.println(f.toString());
            }
            System.out.println("Qual o id da pessoa que deseja remover: ");

            int id = input.nextInt();
            Funcionario f = funcionarios.get(id);
            System.out.println("Usuario removido: " + f.getNome());
            funcionarios.remove(f);

            menu();

        }else {
            System.out.println("Tem nada");
            menu();
        }
    }


    private static void aumentarSalario(){
        System.out.println("Aumentar Salario Funcionario: ");
        System.out.println("Funcionarios Cadastrados: ");

        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
        int id = input.nextInt();

        Funcionario f = funcionarios.get(id);
        System.out.println("Digite o Novo Salario: ");
        String nSalario = input.next();

        menu();

    }

    public static void trocaCargo(){
        System.out.println("Trocar O Cargo: ");
        System.out.println("Funcionarios Cadastrados: ");
        for (Funcionario f : funcionarios){
            System.out.println(f.toString());
        }
        int id = input.nextInt();

        Funcionario f = funcionarios.get(id);
        System.out.println(f.toString());
        System.out.println("Escolha o Novo cargo");

        for (Porcentagem p : Porcentagem.values()){
            System.out.println(p.getID() + ": " + p.name());
        }

        int cargoNovo = input.nextInt();
        Porcentagem valor = Porcentagem.fromId(cargoNovo);

        f.setPorcentagem(valor);

        menu();


    }

}

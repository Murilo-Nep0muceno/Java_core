package SistemaEstoque.test;

import SistemaEstoque.domain.Ferramenta;
import SistemaEstoque.service.CategoriaFerramenta;
import exercicios.funcionario.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEstoqueRun {
    private static Scanner ler = new Scanner(System.in);
    private static ArrayList<Ferramenta> ferramentas;

    public static void main(String[] args) {
        ferramentas = new ArrayList<>();
        menu();


    }

    public static void  menu(){
        System.out.println("--------------");
        System.out.println("Bem Vindo ao Estoque");
        System.out.println("Selecione um opçãão abaixo");
        System.out.println("|    1-Cadastrar Ferramenta     |");
        System.out.println("|    2-Consultar Ferramenta     |");
        System.out.println("|    3-Atualizar Ferramenta     |");
        System.out.println("|    4-Remover Ferramentas       |");
        System.out.println("|    5-Exibir Valor em estoque  |");
        System.out.println("|    6-Sair do sistema          |");

        int op = ler.nextInt();

        switch (op){
            case 1 :
                casdatrarFerramenta();
                break;
            case 2 :
                consultarFerramentas();
                break;
            case 3 :
                atualizarFerramenta();
                break;
            case 4 :
                removerFerramenta();
                break;
            case 5 :
                valorEmEstoque();
                break;
                case 6 :
                System.out.println("Obrigador por usar");
                System.exit(0);
                break;
            default:
                System.out.println("Selecione um opçção valida");
                menu();
                break;
        }



    }

    public static void casdatrarFerramenta(){

        System.out.println("Cadastro de Ferramenta");
        System.out.println("Nome: ");
        String nome = ler.next();
        System.out.println("Digite o Preço: ");
        double preco = ler.nextDouble();
        while (preco <= 0){
            System.out.println("Digite um preço valido: ");
             preco = ler.nextDouble();

        }
        System.out.println("Selecione uma Categoria ");
        consultarCategoria();
        int id = ler.nextInt();
        System.out.println(id);
        while (id != 1 && id !=2){
            System.out.println("Digite uma Categoria valida");
             id = ler.nextInt();

        }
        CategoriaFerramenta categoriaFerramenta = CategoriaFerramenta.fromId(id);
        System.out.println("Digite a quantidade: ");
        int qtd = ler.nextInt();
        while (qtd <= 0){
            System.out.println("Digite a quantidade valida: ");
            qtd= ler.nextInt();
        }
        Ferramenta ferramenta = new Ferramenta(nome,preco,categoriaFerramenta,qtd);
        ferramentas.add(ferramenta);

        System.out.println(ferramenta.toString());
        menu();

    }

    public static void consultarFerramentas(){
        System.out.println("Deseja consultar por ID (1) nome (2) cartegoria (3) listar todas (4)");
        int op = ler.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite o ID da ferramenta");
                int id = ler.nextInt();
                Ferramenta f = ferramentas.get(id);
                System.out.println("Ferramenta Selecionada");
                System.out.println(f.toString());
                menu();
                break;

            case 2:
                System.out.println("Digite o Nome da Ferramenta ");
                String nome = ler.next();
                for (Ferramenta ferramenta : ferramentas) {
                    if (ferramenta.getNomeFerramenta().equals(nome)){
                        System.out.println(ferramenta.toString());
                        return;
                    }
                }
                break;

            case 3:
                System.out.println("Digite o ID da categoria (ELÉTRICA (1) MANUAL (2): ");
                int cat = ler.nextInt();
                for (Ferramenta ferramenta : ferramentas) {
                    if (ferramenta.getCategoriaFerramenta() == CategoriaFerramenta.fromId(cat)){
                        System.out.println(ferramenta.toString());
                        menu();
                    }
                }
                break;
            case 4:
                System.out.println("Listando todos os itens");
                for (Ferramenta ferramenta : ferramentas) {
                    System.out.println(ferramenta.toString());
                }
                break;

            default:
                System.out.println("Digite um correto");
                break;

        }


        menu();


    }

    public static void atualizarFerramenta() {
        System.out.println("Listando todas as Ferramentas do sistema");
        listarFerramentasCadastradas();
        System.out.println("Deseja remover por ID (1) ou por nome (2)");
        int op1 = ler.nextInt();
        int id = 0;
        String nome1 = "";
        Ferramenta f = null;
        if (op1 ==1 ){
            System.out.println("Digite o ID da ferramenta que deseja alterar");
             id = ler.nextInt();
             f = ferramentas.get(id);

        }else if(op1 == 2) {
            System.out.println("Digite o Nome da ferramenta que deseja alterar");
            nome1 = ler.next();
            for (Ferramenta ferra: ferramentas){
                if (ferra.getNomeFerramenta().equals(nome1)){
                    f = ferra;
                }else {
                    System.out.println("Produto não encontrado");
                    atualizarFerramenta();
                }
            }
        }



        System.out.println("Digite o que deseja alterar ");
        System.out.println("|   1- Nome      |");
        System.out.println("|   2- Preco     |");
        System.out.println("|   3- Categoria |");
        System.out.println("|   4- Estoque   |");
        System.out.println("|   5- Tudo      |");


        int op = ler.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o novo nome: ");
                String nome = ler.next();
                f.setNomeFerramenta(nome);
                System.out.println(f.toString());
                menu();

                break;


            case 2:
                System.out.println("Digite o Novo Preço: ");
                double preco = ler.nextDouble();
                f.setPrecoFerramenta(preco);
                System.out.println(f.toString());
                menu();
                break;

            case 3:
                consultarCategoria();
                System.out.println("Digite o ID da nova categoria");
                int catee = ler.nextInt();
                CategoriaFerramenta categoriaFerramenta = CategoriaFerramenta.fromId(catee);
                f.setCategoriaFerramenta(categoriaFerramenta);
                System.out.println(f.toString());
                menu();
                break;

            case 4:
                System.out.println(f.toString());
                System.out.println("Alterar A quantidade em estoque");
                System.out.println("Digite a nova quantidade: ");
                int qtd = ler.nextInt();
                f.setQuatEstoque(qtd);
                System.out.println(f.toString());
                menu();
                break;
            case 5:
                System.out.println("Aterar Item por Completo");
                System.out.println("Digite o nome: ");
                String name = ler.next();
                System.out.println("Digite o preco: ");
                preco = ler.nextDouble();
                while (preco <0){
                    System.out.println("Digite um preco valido");
                    preco = ler.nextDouble();

                }

                System.out.println("Digite a categoria: ");

                consultarCategoria();
                catee = ler.nextInt();
                CategoriaFerramenta categoriaFerramenta1 = CategoriaFerramenta.fromId(catee);
                System.out.println("Digite a nova quantidade: ");
                qtd = ler.nextInt();
                while (qtd < 0){
                    System.out.println("Digite uma quantidade valida");
                    qtd = ler.nextInt();

                }

                f.setNomeFerramenta(name);
                f.setPrecoFerramenta(preco);
                f.setCategoriaFerramenta(categoriaFerramenta1);
                f.setQuatEstoque(qtd);
                System.out.println(f.toString());
                menu();

                break;


            default:
                System.out.println("Digite uma opção valida");
                atualizarFerramenta();
                break;

        }



    }

    private static void consultarCategoria(){
        for (CategoriaFerramenta p : CategoriaFerramenta.values()){
            System.out.println(p +" " +p.getID() +": "  );
        }
    }

    private static void listarFerramentasCadastradas(){
        for (Ferramenta ferramenta : ferramentas) {
            System.out.println(ferramenta.toString());
        }
    }

    public static void removerFerramenta(){
        System.out.println("Ferramentas Cadastradas");
        listarFerramentasCadastradas();
        System.out.println("Deseja remover por ID (1) ou por nome (2)");
        Ferramenta ferramentaSelected = null;
        int op = ler.nextInt();
        int id;
        String nome;
        if (op == 1){
            System.out.println("Digite o ID para Remover Ferramenta em estoque: ");
             id = ler.nextInt();
            ferramentaSelected = ferramentas.remove(id);
            System.out.println("Removendo...");
            menu();
        }else if(op == 2){
            System.out.println("Digite o nome para Remover a Ferramenta em estoque: ");
            nome = ler.next();
           boolean remover =  ferramentas.removeIf(ferramenta -> ferramenta.getNomeFerramenta().equals(nome) );

           if (remover){
               System.out.println("Item removido com sucesso");
               menu();
           }
           else {
               System.out.println("Item não encontrado");
               removerFerramenta();
           }

        }else {
            System.out.println("opçao invalida ");
            removerFerramenta();
        }




    }

    public static void valorEmEstoque(){
        System.out.println("Valor Toda do estoque em R$:");
        double precoTotal =0;
        double precoItem =0;
        int qtdItem =0;
        for (Ferramenta ferramenta : ferramentas) {
             precoItem =ferramenta.getPrecoFerramenta();
             qtdItem = ferramenta.getQuatEstoque();
             precoTotal += precoItem * qtdItem;
        }
        System.out.println("Valor total em estoque de: R$" + precoTotal) ;

        menu();
    }


}



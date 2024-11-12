package mercado.main;

import mercado.modelo.Produto;
import mercado.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mercado {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Produto> produtos;
    private static Map<Produto, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();
        menu();
    }

    public static void menu() {
        System.out.println("|     Mercado     |");
        System.out.println("|-----------------|");
        System.out.println("|     1- Cadastro     |");
        System.out.println("|     2- Listar       |");
        System.out.println("|     3- Comprar      |");
        System.out.println("|     4- Carrinho     |");
        System.out.println("|     5- Sair         |");

        int op = input.nextInt();

        switch (op) {
            case 1:
                cadastrarProduto();
                break;

            case 2:
                listarProduto();
                break;

            case 3:
                comprarProduto();
                break;

            case 4:
                verCarrinho();
                break;

            case 5:
                System.out.println("Saindo do sistema");
                System.exit(0);
                break;

            default:
                System.out.println("Nenhuma op selecionada");
                menu();
                break;
        }

    }

    private static void cadastrarProduto(){
        System.out.println("Nome: produto");
        String nome = input.next();

        System.out.println("Preco do Produto: ");
        Double preco = input.nextDouble();

        Produto produto = new Produto(nome,preco);
        produtos.add(produto);
        System.out.println(produto.getNome()+" Cadastrado com sucesso");
        menu();
    }

    private static void listarProduto(){
        if (produtos.size() > 0){
            System.out.println("Lista de Produtos!\n");

            for (Produto p : produtos){
                System.out.println(p);
            }
        }else{

            System.out.println("Nenhum Produto Cadastrado");
        }

        menu();
    }

    private static void comprarProduto(){
        if (produtos.size() > 0){
            System.out.println("Codigo do Produto");

            for (Produto p : produtos){
                System.out.println(p + "\n");
            }

            int id = Integer.parseInt(input.next());
            boolean isPresent = false;

            for (Produto p : produtos){
                if (p.getId() == id){
                    int qtd =0;

                    try {
                        qtd = carrinho.get(p);
                        carrinho.put(p, qtd+1);
                    }catch (NullPointerException e){
                        carrinho.put(p,1);
                    }

                    System.out.println(p.getNome() +" Adicionado ao carrinho");
                    isPresent = true;

                    if (isPresent){
                        System.out.println("Deseja outro item ?");
                        System.out.println("1 para sim, 0 para não");
                       int op = Integer.parseInt(input.next());


                       if (op == 1){
                           cadastrarProduto();
                       }else {
                           finalizarCompra();
                       }
                    }
                }
            }
        }
    }

    private static void verCarrinho(){
        System.out.println("---Produtos Carrinho---");
        if (carrinho.size() > 0){
            for (Produto p : carrinho.keySet()){
                System.out.println("Produto " + p + "\n" +"Quantidade: " + carrinho.get(p));
            }
        }
    }

    private static  void finalizarCompra(){
        double valorDaCompra =0;
        System.out.println("Seus produtos");
        for (Produto p: carrinho.keySet()){
            int qtd = carrinho.get(p);
            valorDaCompra+= p.getPreco() *qtd;
        }
        System.out.println("O valor da sua compra" + Utils.doubleToString(valorDaCompra));
        carrinho.clear();
        menu();
    }


}

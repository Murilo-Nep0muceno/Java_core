package Wpolimorfismo.test;

import Wpolimorfismo.domain.Computador;
import Wpolimorfismo.domain.Produto;
import Wpolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("I9 9700K", 1999);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------------");
        Produto produto1 = new Tomate("cereja", 1999);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }


}

package Wpolimorfismo.test;

import Wpolimorfismo.domain.Computador;
import Wpolimorfismo.domain.Produto;
import Wpolimorfismo.domain.Tomate;
import Wpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("I9 9700K", 1999);

        System.out.println("----------------------");

        Tomate tomate = new Tomate("cereja", 1999);
        tomate.setDataValidade("11/12/2005");

        CalculadoraImposto.calcularImposto(tomate);

    }


}

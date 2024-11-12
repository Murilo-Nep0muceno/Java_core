package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class  ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 3DX", 19999);

        System.out.println("0----------------0");

        Tomate produto2 = new Tomate("americano", 11);
        produto2.setDataValidade("11/12/2012");
        CalculadoraImposto.calcularImposto(produto2);



    }

}

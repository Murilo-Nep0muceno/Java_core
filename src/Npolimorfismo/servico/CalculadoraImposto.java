package Npolimorfismo.servico;

import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto =produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor : " + produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto );
        if(produto instanceof Tomate ){

        Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataValidade());
        }
    }
}

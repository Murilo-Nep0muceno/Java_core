package Wpolimorfismo.servico;

import Wpolimorfismo.domain.Computador;
import Wpolimorfismo.domain.Produto;
import Wpolimorfismo.domain.Tomate;

public class CalculadoraImposto {


    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Porduto + "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("Imposto a ser pago + "+ imposto);
        if (produto instanceof Tomate){

        System.out.println(((Tomate) produto).getDataValidade());
        }

    }
}

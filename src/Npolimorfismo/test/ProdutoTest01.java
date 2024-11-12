package Npolimorfismo.test;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Televisao;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Pc-Gaymêr", 99999999);
        Tomate tomate = new Tomate("Tomate cereja", 88);
        Televisao tv = new Televisao("Sansunga 50\" " , 44);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("0-----------0");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("0-----------0");
CalculadoraImposto.calcularImposto(tv);

    }
}

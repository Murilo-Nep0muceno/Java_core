package Wpolimorfismo.test;

import Wpolimorfismo.domain.Computador;
import Wpolimorfismo.domain.Tomate;
import Wpolimorfismo.servico.CalculadoraImposto;
import wInterfaces.domain.Televisao;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 7600", 6899);
        Tomate tomate = new Tomate("Tomate cereja", 19.99);
        Televisao tv = new Televisao("Tv Sansung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}

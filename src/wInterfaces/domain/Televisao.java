package wInterfaces.domain;

import Wpolimorfismo.domain.Produto;

public class Televisao extends Produto {
    public static final double IMPOSTO = 0.32;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Televisao");
        return this.valor * IMPOSTO;
    }


}

package Npolimorfismo.domain;

public class Televisao extends Produto{
    public static final double IMPOSTO =0.91;


    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Televisão");
        return this.valor * IMPOSTO;
    }

}

package Atestbrains.domain;

public class Cozinheiro extends Funcionario{
    public Cozinheiro(String nome, double salario, String funcao) {
        super(nome, salario, funcao);
    }




    @Override
    public double calcularImposto() {
        System.out.println("Salario descontado");
        return this.salario * 0.15;
    }
}

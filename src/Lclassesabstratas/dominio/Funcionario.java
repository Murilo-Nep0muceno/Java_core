package Lclassesabstratas.dominio;

public abstract class Funcionario  extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imrpime() {
        System.out.println("Impressão");
    }

    public abstract void calcularBonus();


}

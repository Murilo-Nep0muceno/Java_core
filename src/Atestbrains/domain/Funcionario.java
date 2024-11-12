package Atestbrains.domain;

import Atestbrains.servico.TaxaSalario;

public class Funcionario implements TaxaSalario {
    protected String nome;
    protected double salario;
    protected String funcao;

    public Funcionario(String nome, double salario, String funcao) {
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", funcao='" + funcao + '\'' +
                '}';
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
}


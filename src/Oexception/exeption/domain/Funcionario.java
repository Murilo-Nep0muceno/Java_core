package Oexception.exeption.domain;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando Funcionario");
    }
}

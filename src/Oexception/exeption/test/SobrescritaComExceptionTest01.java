package Oexception.exeption.test;

import Oexception.exeption.domain.Funcionario;
import Oexception.exeption.domain.LoginInvalidoException;
import Oexception.exeption.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}

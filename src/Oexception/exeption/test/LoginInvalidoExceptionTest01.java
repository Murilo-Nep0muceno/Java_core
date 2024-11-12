package Oexception.exeption.test;

import Oexception.exeption.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }

    private static void logar() throws LoginInvalidoException{
        Scanner tecc = new Scanner(System.in);
        String usernameDB = "GOku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String userDigit = tecc.next();
        System.out.println("Senha");
        String senhaDigit = tecc.next();
        if (!usernameDB.equals(userDigit) || !senhaDB.equals(senhaDigit)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}

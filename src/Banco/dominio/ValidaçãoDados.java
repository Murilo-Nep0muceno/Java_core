package Banco.dominio;

public class ValidaçãoDados {

    public String nome(ContaPessoa nome){
        if (nome.pessoa  != null ){

            return nome.pessoa;
        }

        return "Errado";
    }

    public int numeroConta(ContaPessoa numeroConta){
        if (numeroConta.numeroConta != 0){
            return numeroConta.numeroConta;
        }
        return 0;
    }

    public int senha(ContaPessoa senha){
        if (senha.senha != 0){
            return senha.senha;
        }
        return 0;
    }


}

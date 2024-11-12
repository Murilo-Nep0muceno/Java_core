package Banco.dominio;

public class ImprimirDados {
    public void imprimir(ContaPessoa pessoa){
        System.out.println(pessoa.numeroConta);
        System.out.println(pessoa.pessoa);
        System.out.println(pessoa.senha);
    }
}

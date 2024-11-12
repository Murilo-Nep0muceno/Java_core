package Hherança.test;

import Hherança.dominio.Endereco;
import Hherança.dominio.Funcionario;
import Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos bobos");
        endereco.setCep("0857380");
        Endereco[] e = {endereco};

        Pessoa pessoa = new Pessoa("Muti", "88837873", e);
        pessoa.setNome("Murilo");
        pessoa.setCpf("52804120821");;
        pessoa.setEndereco(e);

        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Muhhhti", "888gfhdfghf37873", e,2222 );

        funcionario.setNome("Natalia");
        funcionario.setCpf("52811102340");
        funcionario.setSalario(44432);
        funcionario.setEndereco(e);

        funcionario.imprime();


    }
}

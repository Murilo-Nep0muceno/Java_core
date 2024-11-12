package maratonajava.Bintroducaometodos.test;

import maratonajava.Bintroducaometodos.dominio.Fucnionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Fucnionarios funcionarios = new Fucnionarios();

        funcionarios.nome = "Murilo";
        funcionarios.idade = 19;
        funcionarios.salario =new double[]{1200,987.32,2000};
        funcionarios.imprimirDados();
    }
}

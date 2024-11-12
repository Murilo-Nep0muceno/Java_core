package maratonajava.Bintroducaometodos.test;

import maratonajava.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Saitama";
        estudante01.idade = 26;
        estudante01.sexo = "Macho";

        estudante02.nome = "Hinata";
        estudante02.idade = 26;
        estudante02.sexo = "Woman";

         estudante01.imprime();
         estudante02.imprime();
    }
}

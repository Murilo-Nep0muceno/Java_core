package maratonajava.Aintroducaoclasses.test;

import maratonajava.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 123;
        estudante.nome = " He he he";
        estudante.sexo = "M";
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

    }
}

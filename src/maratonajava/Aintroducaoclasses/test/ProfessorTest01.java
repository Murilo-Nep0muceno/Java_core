package maratonajava.Aintroducaoclasses.test;

import maratonajava.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String args[]) {
        Professor professor = new Professor();

        professor.nome = "Kakashi sensei";
        professor.idade = 35;
        professor.sexo = "M";
        System.out.println(professor.nome + "\n" + professor.idade + "\n" + professor.sexo);

    }

}

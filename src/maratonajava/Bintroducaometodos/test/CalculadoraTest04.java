package maratonajava.Bintroducaometodos.test;

import maratonajava.Bintroducaometodos.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args    ) {
        Calculadora calculadora = new Calculadora();

        int[] numeros= {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,0);
    }
}

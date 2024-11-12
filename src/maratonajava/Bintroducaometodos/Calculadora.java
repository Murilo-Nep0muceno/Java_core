package maratonajava.Bintroducaometodos;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(10 - 10);
    }

    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public int divideDoisNumeros(double n1, double n2) {
        if (n2 == 0 && n1 == 0) {
            return 0;
        }
        return (int) (n1 / n2);
    }

    public void imprimeDivisaoDeDoisNumeros(double n1, double n2) {
        if (n2 == 0){
            System.out.println("Não tem divisão por 0");
        }
    }

    public void alteraDoisNumeros(int n1, int n2){
       n1 = 99;
       n2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + n1);
        System.out.println("Num2 " + n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;

        }
        System.out.println(soma);

    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;

        }
        System.out.println(soma);
    }
}

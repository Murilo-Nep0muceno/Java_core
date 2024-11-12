package maratonajava.Bintroducaometodos.dominio;

public class Fucnionarios {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados() {

        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double num : salario) {
            System.out.println(num);
        }
        System.out.println("-------------------");
        imprimirMedia();
    }

    public void imprimirMedia() {

        double soma = 0;
        if (salario == null) {

            return;
        }
        for (double more : salario) {
            soma += more;

        }
        soma /= salario.length;

        System.out.printf("A media salaria foi R$ %.2f", soma);

    }


}

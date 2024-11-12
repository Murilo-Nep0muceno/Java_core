package maratonajava.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        if (nome == null){
            System.out.println("Nome invalido");
        }
        this.nome = nome;
    }


    public void setIdade(int idade){
        if (idade<0){
            System.out.println("idade invalida");
            return;
        }
        this.idade= idade;
    }

    public String getNome(){
       return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}

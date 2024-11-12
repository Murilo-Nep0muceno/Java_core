package Hherança.dominio;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco[] endereco;

    public Pessoa(String nome, String cpf, Endereco[] endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        for (Endereco endereco1 : this.endereco) {
            System.out.println(endereco1.getRua());
            System.out.println(endereco1.getCep());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }
}


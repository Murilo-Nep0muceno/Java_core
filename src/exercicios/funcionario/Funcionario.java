package exercicios.funcionario;

public class Funcionario {
    private static int count =0;
    private int id;
    private String nome;
    private String funcao;
    private Porcentagem porcentagem;

    public Funcionario() {
    }

    public Funcionario(String nome, String funcao, Porcentagem porcentagem) {
        this.id = count;
        this.nome = nome;
        this.funcao = funcao;
        this.porcentagem = porcentagem;
        Funcionario.count +=1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Porcentagem getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Porcentagem porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", porcentagem=" + porcentagem +
                '}';
    }
}

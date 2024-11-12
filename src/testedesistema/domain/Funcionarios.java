package testedesistema.domain;

public class Funcionarios {
    private String nome;
    private int idade;
    private Pedido[] pedidos;


    public Funcionarios(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Funcionarios(String nome, int idade, Pedido[] pedidos) {
        this.idade = idade;
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public void imprimirDadosFuncionarios(){
        System.out.println("Nome funcionario: " + this.nome);
        System.out.println("idade funcionario: " + this.idade);
        System.out.println("Todos os pedidos do: " + this.nome);
        for (Pedido pedido : pedidos) {
            System.out.println("*----------------------*");
            System.out.println(pedido.getId());
            System.out.println(pedido.getDesc());

        }


    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

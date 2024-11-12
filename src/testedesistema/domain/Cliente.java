package testedesistema.domain;

public class Cliente {
    private String cpf;
    private String nome;
    private Pedido[] pedidos;

    public Cliente(String cpf, String nome, Pedido[] pedidos) {
        this.pedidos = pedidos;
        this.cpf = cpf;
        this.nome = nome;
    }

    public void imrpimirDadosCliente(){
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Todos os pedidos do " + this.nome);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


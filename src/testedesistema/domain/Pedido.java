package testedesistema.domain;

public class Pedido {
    private int id;
    private String desc;
    private Cliente cliente;
    private Funcionarios funcionario;


    public Pedido(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Pedido(int id, String desc, Cliente cliente, Funcionarios funcionario) {
        this.id = id;
        this.desc = desc;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public void imprimirDados(){
        System.out.println("ID do pedido: " + this.id);
        System.out.println("Descrição pedido: " + this.desc);


        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Funcionario que atendeu: " +this.funcionario.getNome() );


    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

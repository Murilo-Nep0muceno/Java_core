package Kenum.domain;

public class Client {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;


    public Client(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='7" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteint=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}

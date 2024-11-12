package testedesistema.test;

import testedesistema.domain.Cliente;
import testedesistema.domain.Funcionarios;
import testedesistema.domain.Pedido;

public class CafeteriaTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1234,"Produto do balaco baco" );
        Pedido pedido2 = new Pedido(555, "Sabonete diferent");
        Pedido pedido3 = new Pedido(15, "OP vol 1");
        Pedido[] pedidos = {pedido, pedido2,pedido3};
        Funcionarios funcionarios = new Funcionarios("CLeber", 55, pedidos);
        Cliente cliente = new Cliente("52804120821", "José", pedidos);

        pedido.setCliente(cliente);
        pedido.setFuncionario(funcionarios);

        pedido.imprimirDados();
        System.out.println("\n\n");
        cliente.imrpimirDadosCliente();
        System.out.println("\n\n");
        funcionarios.imprimirDadosFuncionarios();
    }
}

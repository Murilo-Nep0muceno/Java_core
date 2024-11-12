package Kenum.test;

import Kenum.domain.Client;
import Kenum.domain.TipoCliente;
import Kenum.domain.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("TSUBASA", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Client client2 = new Client("TSUBASA", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(client1);
        System.out.println(client2);
    }
}

package Wpolimorfismo.servico;

import Wpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um memoria");

    }
}

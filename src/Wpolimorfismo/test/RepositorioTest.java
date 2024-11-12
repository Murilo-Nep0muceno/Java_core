package Wpolimorfismo.test;

import Wpolimorfismo.repositorio.Repositorio;
import Wpolimorfismo.servico.RepositorioArquivo;
import Wpolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}

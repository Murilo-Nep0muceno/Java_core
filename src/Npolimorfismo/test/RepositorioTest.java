package Npolimorfismo.test;


import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioArquivo;
import Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");

        System.out.println(list);
    }
}

package Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {


    @Override
    public void load() {
        System.out.println("Carregando do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Remove from dataBase");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no database");

    }
}

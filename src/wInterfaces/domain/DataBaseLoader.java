package wInterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando do Banco de Dados");

    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Ta carregando serto");
    }
}

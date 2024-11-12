package Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Remove from file  ");
    }
    @Override
    public void checkPermission() {
        System.out.println("Cheking permition in file");

    }
}

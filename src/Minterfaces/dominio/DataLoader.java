package Minterfaces.dominio;

public interface DataLoader {

    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo Checagem de permissões");

    }

    static void retrieveNaxdATASize(){
        System.out.println("Dentro do retrieveNaxdATASiz");
    }





}

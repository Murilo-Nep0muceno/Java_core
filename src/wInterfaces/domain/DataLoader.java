package wInterfaces.domain;

public interface DataLoader {
     int MAX_DATA_SIZE = 10;

     void load();
     default void checkPermission(){
          System.out.println("Fazendo Checkagem de permissao");
     }

     static void retrieveMaxDataSize(){
          System.out.println("Dentro do retrieveMaxDataSize NA INTERFACE");
     }

}

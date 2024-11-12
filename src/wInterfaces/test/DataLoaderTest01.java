package wInterfaces.test;


import wInterfaces.domain.DataBaseLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
       DataBaseLoader dataBaseLoader = new DataBaseLoader ();

        dataBaseLoader.load();
        dataBaseLoader.remove();
    }
}

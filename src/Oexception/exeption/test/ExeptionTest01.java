package Oexception.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) throws IOException{

        criarNovoArquivo();
    }

    private static void criarNovoArquivo()throws IOException {
        File file = new File("arquivo\\test.txt");
        try {
          boolean cr =  file.createNewFile();
            System.out.println("Arquivo criado " + cr);
        }catch (IOException e ){
            e.printStackTrace();
            throw e;
        }
    }

}

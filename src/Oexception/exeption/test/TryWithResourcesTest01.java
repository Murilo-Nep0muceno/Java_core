package Oexception.exeption.test;

import Oexception.exeption.domain.Leitor1;
import Oexception.exeption.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
    lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("Test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null){
                    reader.close();

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

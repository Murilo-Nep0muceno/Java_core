package beecrowd.test.exec;

import beecrowd.test.PritnName;

import java.util.Scanner;

public class printNameTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        String ae = input.next();
        PritnName printName =new PritnName(nome, 19 , ae);
        String pegandoAporraDoNome = printName.getNome();
        printName.setNome("aa");
        printName.print();

    }
}

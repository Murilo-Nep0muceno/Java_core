package exercicios;

import java.util.Scanner;
public class java {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        String categoria;
        if(idade < 15){
            categoria ="Categoria Infantil";
            
        } else if (idade >= 15 && idade < 18){
                 categoria ="Categoria Juvenil";
        }else{
             categoria = "Categoria Adulta";
        }
    System.out.println(categoria);
    }
}

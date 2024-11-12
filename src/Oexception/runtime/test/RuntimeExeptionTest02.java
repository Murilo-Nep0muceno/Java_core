package Oexception.runtime.test;

public class RuntimeExeptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);

        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }
    private static int divisao(int a, int b){
       if (b ==0){
           throw new IllegalArgumentException( "Argumento ilegal");
       }
       return a/b;
}}

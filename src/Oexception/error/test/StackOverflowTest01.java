package Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recusirvidade();
    }

    public static void recusirvidade(){
        recusirvidade();
    }

}

package exercicios;

import java.util.Scanner;

public class doacao {
    public static void  main (String[] args){
        Scanner ler = new Scanner(System.in);
        double salarioAnual = ler.nextDouble();
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.5/100;
        double terceiraFaixa = 49.5/100;
        double valorImposto;
        int valorFaixa;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual *   primeiraFaixa;
            valorFaixa =1;
        }else if(salarioAnual > 34713 && salarioAnual<= 68507){
            valorImposto = salarioAnual + segundaFaixa;
            valorFaixa =2;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
            valorFaixa =3;
        }
        System.out.printf("O valor do exercicios.imposto foi  caiu na faixa %s" ,valorImposto );
    }
}

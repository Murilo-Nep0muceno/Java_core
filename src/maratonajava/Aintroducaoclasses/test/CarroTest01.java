package maratonajava.Aintroducaoclasses.test;

import maratonajava.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1 = carro2;


        carro1.nome = "Fuscão Preto";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Ferrari Fraquinha";
        carro2.modelo = "carroça";
        carro2.ano = 2015;


        System.out.println(carro1.nome+"\n" + carro1.modelo+"\n" + carro1.ano +"\n");
        System.out.println(carro2.nome +"\n" + carro2.modelo+"\n" + carro2.ano);
    }
}

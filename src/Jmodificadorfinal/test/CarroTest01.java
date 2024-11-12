package Jmodificadorfinal.test;

import Jmodificadorfinal.dominio.Carro;
import Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
          System.out.println(Carro.VELOCIDADE_LIMITE);
          System.out.println(carro.COMPRADOR);
            carro.COMPRADOR.setNome("Carro de mim");
        System.out.println(carro.COMPRADOR);
    }
}

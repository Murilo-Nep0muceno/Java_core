package Atestbrains.test;

import Atestbrains.domain.Cozinheiro;
import Atestbrains.domain.Funcionario;

public class CozinhaTest01 {


    public static void main(String[] args) {
        Funcionario fucionairo = new Cozinheiro("José", 5991.1,"Chefe de cozinha");
        fucionairo.calcularImposto();

        System.out.println(fucionairo.calcularImposto());
        System.out.println(fucionairo.toString());
    }
}

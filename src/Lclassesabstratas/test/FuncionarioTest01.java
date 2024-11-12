package Lclassesabstratas.test;


import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Gerente;


public class FuncionarioTest01  {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Woman", 223);
        Desenvolvedor desenvolvedor = new Desenvolvedor("TT", 35000);
        System.out.println(desenvolvedor);
         System.out.println(gerente);
         gerente.imrpime();
    }

}

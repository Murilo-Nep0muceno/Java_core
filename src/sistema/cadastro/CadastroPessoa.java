package sistema.cadastro;

import java.util.Arrays;

public class CadastroPessoa {
    public String NomeCompleto( String nome){

        return nome.toUpperCase() ;

    }
    public String[] Cadastro( String nome1, String senha, String login ){

       String [] arrayDados = new String[]{nome1,senha,login} ;


        return arrayDados;
    }

    public void Sacar(){
        System.out.println("1");
    }
    public void Depositar(){
        System.out.println("1");
    }

//    public String[] Cadastro() {
//        return Cadastro();
//    }
}

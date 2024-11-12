package exercicios.funcionario;

public enum Porcentagem {
    BALCONISTA(1800, 1){
        @Override
        public double valorComiisao(double valor) {
            return valor * 0.05;
        }


    },

    ATENDENTE(2100,2){
        @Override
        public double valorComiisao(double valor) {
            return valor * 0.1;
        }

    },
    GERENTE(7899, 3){
        @Override
        public double valorComiisao(double valor) {
            return valor * 0.15;
        }



    },
    FAXINEIRO(11111,4){
        @Override
        public double valorComiisao(double valor) {
            return valor * 0.05;
        }

    },
    COZINHEIRO(3200, 5){
        @Override
        public double valorComiisao(double valor) {
            return valor * 0.1;
        }

    };

    public final double salario;
    public final int id;

    Porcentagem(double salario, int id){
        this.salario = salario;
        this.id = id;
    }

    public abstract double valorComiisao(double valor);

    public int getID(){
        return this.id;

    }
    
    public static Porcentagem fromId(int id) {
        for (Porcentagem p: Porcentagem.values()){
            if (p.getID() == id){
                return p;
            }
        }
        return null;
    }


}

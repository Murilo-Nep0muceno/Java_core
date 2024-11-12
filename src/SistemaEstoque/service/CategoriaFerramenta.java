package SistemaEstoque.service;


public enum CategoriaFerramenta {
    ELÉTRICA(1),
    MANUAL(2);

    public final int id;

    public int getID(){
        return this.id;

    }

    CategoriaFerramenta(int id){
        this.id = id;
    }
    public static CategoriaFerramenta fromId(int id) {
        for (CategoriaFerramenta p: CategoriaFerramenta.values()){
            if (p.getID() == id){
                return p;
            }
        }
        return null;
    }

}

package SistemaEstoque.domain;

import SistemaEstoque.service.CategoriaFerramenta;

public class Ferramenta {
    private static int cod = 0;
    private int idFerramenta;
    private String nomeFerramenta;
    private double precoFerramenta;
    private CategoriaFerramenta categoriaFerramenta;
    private int quatEstoque;



    public Ferramenta(String nomeFerramenta, double precoFerramenta, CategoriaFerramenta categoriaFerramenta, int quatEstoque) {
        this.idFerramenta = cod;
        this.nomeFerramenta = nomeFerramenta;
        this.precoFerramenta = precoFerramenta;
        this.categoriaFerramenta = categoriaFerramenta;
        this.quatEstoque = quatEstoque;
        Ferramenta.cod +=1;
    }

    public void setQuatEstoque(int quatEstoque) {
        this.quatEstoque = quatEstoque;
    }

    public CategoriaFerramenta getCategoriaFerramenta() {
        return categoriaFerramenta;
    }

    public void setCategoriaFerramenta(CategoriaFerramenta categoriaFerramenta) {
        this.categoriaFerramenta = categoriaFerramenta;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public double getPrecoFerramenta() {
        return precoFerramenta;
    }

    public void setPrecoFerramenta(double precoFerramenta) {
        this.precoFerramenta = precoFerramenta;
    }

    public int getQuatEstoque() {
        return quatEstoque;
    }

    @Override
    public String toString() {
        return "Ferramenta{" +
                "idProduto=" + idFerramenta +
                ", nomeFerramenta='" + nomeFerramenta + '\'' +
                ", precoFerramenta=" + precoFerramenta +
                ", categoriaFerramenta=" + categoriaFerramenta +
                ", qtdEstoque=" + quatEstoque +
                '}';
    }
}

package model;

public class Car {
    private int id;
    private String descricao;
    private float preco;
    private String marca;

    public Car() {
        id = -1;
        descricao = "";
        preco = 0.00F;
        marca = "";
    }

    public Car(int id, String descricao, float preco, String marca) {
        setId(id);
        setDescricao(descricao);
        setPreco(preco);
        setMarca(marca);
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método sobreposto da classe Object. É executado quando um objeto precisa
     * ser exibido na forma de String.
     */

    @Override
    public String toString() {
        return "Produto: " + descricao + "   Preço: R$" + preco + "   Marca.: " + marca;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.getID() == ((Car) obj).getID());
    }
}
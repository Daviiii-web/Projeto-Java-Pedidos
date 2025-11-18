package entities;

public class Product {

    private String nome;
    private double preco;

    public Product(String name, double price){
        this.nome = name;
        this.preco = price;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public double getPrice() {
        return preco;
    }

    public void setPrice(Double price) {
        this.preco = price;
    }
}

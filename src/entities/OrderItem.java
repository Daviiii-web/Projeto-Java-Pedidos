package entities;

public class OrderItem {

    private  int quantidade;
    private  double preco;

    private Product produto;

    public OrderItem(int quantidade, double preco, Product produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;

    }

    public int getQuantidade() {
        return quantidade;
    }


    public double getPreco() {
        return preco;
    }

    public Product getProduct() {
        return produto;
    }

    public double subTotal() {
        return quantidade * preco;

    }

    @Override
    public String toString() {
        return produto.getName()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade +
                ", Total: $"
                + String.format("%.2f", subTotal());
    }
}

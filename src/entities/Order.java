package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();

    private Client cliente;

    public Order(Date date, OrderStatus status, Client cliente){
        this.momento = date;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getDate() {
        return momento;
    }

    public OrderStatus getOrder() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return cliente;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data e hora do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do pedido:\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}

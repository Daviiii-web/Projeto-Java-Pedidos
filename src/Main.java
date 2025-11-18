import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        Date dataNascimento = sdf.parse(sc.next());

        Client client = new Client(nome, email, dataNascimento);

        System.out.println("Insira os dados do pedido:");
        System.out.print("Status");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos itens vai ter nesse pedido? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Dados #" + i + " Item");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();

            Product produto = new Product(nomeProduto, precoProduto);
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantidade, precoProduto, produto);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.print("Resumo do pedido ");
        System.out.println(order);


        sc.close();
    }
}
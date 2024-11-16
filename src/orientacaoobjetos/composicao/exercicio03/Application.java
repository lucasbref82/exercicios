package orientacaoobjetos.composicao.exercicio03;

import orientacaoobjetos.composicao.exercicio03.entities.Cliente;
import orientacaoobjetos.composicao.exercicio03.entities.Pedido;
import orientacaoobjetos.composicao.exercicio03.entities.PedidoItem;
import orientacaoobjetos.composicao.exercicio03.entities.Produto;
import orientacaoobjetos.composicao.exercicio03.enums.StatusPedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    private static final DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Data de Aniversário (DD/MM/YYYY): ");
        LocalDate dataAniversario = LocalDate.parse(scanner.next(), padraoData);
        Cliente cliente = new Cliente(nome, email, dataAniversario);
        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        StatusPedido statusPedido = StatusPedido.valueOf(scanner.next());
        Pedido pedido = new Pedido(LocalDate.now(), statusPedido, cliente);
        System.out.print("Quantos itens terá o pedido ? ");
        int quantidadeItens = scanner.nextInt();
        for (int i = 1; i <= quantidadeItens; i++) {
            System.out.println("Digite os dados do #" + i + " item: ");
            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.next();
            System.out.print("Preço do produto: ");
            Double precoProduto = scanner.nextDouble();
            Produto produto = new Produto(nomeProduto, precoProduto);
            System.out.print("Quantidade: ");
            Integer quantidade = scanner.nextInt();
            PedidoItem pedidoItem = new PedidoItem(quantidade, produto);
            pedido.adicionaItem(pedidoItem);
        }
        System.out.println();
        System.out.println("Resumo do pedido: ");
        System.out.println(pedido);
        scanner.close();

    }
}

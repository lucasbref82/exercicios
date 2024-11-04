package objetos.introducao.aplication.exercicio02;

import objetos.introducao.aplication.exercicio02.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = scanner.next();

        System.out.print("Valor: ");
        produto.valor = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.estoque = scanner.nextInt();

        System.out.println(produto);

        System.out.println("Entre com um valor para adicionar ao estoque: ");
        produto.adicionarEstoque(scanner.nextInt());
        System.out.println(produto);

        System.out.println("Entre com um valor para ser removido do estoque: ");
        produto.removerEstoque(scanner.nextInt());
        System.out.println(produto);
        scanner.close();
    }
}

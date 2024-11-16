package orientacaoobjetos.herenca.exercicio02;

import orientacaoobjetos.herenca.exercicio02.entities.Produto;
import orientacaoobjetos.herenca.exercicio02.entities.ProdutoImportado;
import orientacaoobjetos.herenca.exercicio02.entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    private static final DateTimeFormatter PADRAO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de produtos: ");
        int n = scanner.nextInt();
        List<Produto> produtos = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do #" + i + " produto: ");
            System.out.print("Comum, usado ou importado (c/u/i) ? ");
            char tipo = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Preco: ");
            Double preco = scanner.nextDouble();
            if (tipo == 'c') {
                produtos.add(new Produto(nome, preco));
            } else if (tipo == 'i') {
                System.out.print("Taxa de importação: ");
                Double taxaImportacao = scanner.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
            } else if (tipo == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                String dataFabricacao = scanner.next();
                produtos.add(new ProdutoUsado(nome, preco, LocalDate.parse(dataFabricacao, PADRAO_DATA)));
            }
        }
        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO: ");
        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
        }
        scanner.close();
    }
}

package orientacaoobjetos.arranjos.exercicio02;

import orientacaoobjetos.arranjos.exercicio02.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de números a serem lidas.");
        int quantidadeLida = sc.nextInt();
        Produto[] produtos = new Produto[quantidadeLida];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.next();
            System.out.print("Digite o valor do produto: ");
            Double valor = sc.nextDouble();
            produtos[i] = new Produto(nome, valor);
        }

        Double somaPrecos = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            somaPrecos += produtos[i].getPreco();
        }

        System.out.println("Preço médio: " + String.format("%.2f", somaPrecos / produtos.length));

        sc.close();
    }
}

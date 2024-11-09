package orientacaoobjetos.arranjos.exercicio04;

import orientacaoobjetos.arranjos.exercicio04.entities.Pessoa;
import orientacaoobjetos.arranjos.exercicio04.service.PessoaService;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadePessoas = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[quantidadePessoas];
        for(int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            Integer idade = sc.nextInt();
            System.out.print("Altura: ");
            Double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        PessoaService pessoaService = new PessoaService();

        System.out.println("Altura média: " + String.format("%.2f", pessoaService.calculaMediaAltura(pessoas)));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", pessoaService.calculaPorcentagem(pessoas)) + "%");
        pessoaService.imprimirPessoasMenores16(pessoas);

    }
}

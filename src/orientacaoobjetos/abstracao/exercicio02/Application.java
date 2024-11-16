package orientacaoobjetos.abstracao.exercicio02;

import orientacaoobjetos.abstracao.exercicio02.entities.Pessoa;
import orientacaoobjetos.abstracao.exercicio02.entities.PessoaFisica;
import orientacaoobjetos.abstracao.exercicio02.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int n = scanner.nextInt();
        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da #" + i + " pessoa: ");
            System.out.print("Física ou Jurídica (f/j)? ");
            char tipoPessoa = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Renda anual: ");
            Double rendaAnual = scanner.nextDouble();
            if (tipoPessoa == 'j') {
                System.out.print("Quantidade de funcionários: ");
                Integer quantidadeFuncionarios = scanner.nextInt();
                pessoas.add(new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios));
            }
            if (tipoPessoa == 'f') {
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = scanner.nextDouble();
                pessoas.add(new PessoaFisica(nome, rendaAnual,gastosSaude));
            }
        }
        System.out.println();
        System.out.println("IMPOSTOS PAGOS: ");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.calculoImposto()));
        }
        var totalImpostos = pessoas
                .stream()
                .mapToDouble(Pessoa::calculoImposto)
                .sum();

        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", totalImpostos));
    }
}

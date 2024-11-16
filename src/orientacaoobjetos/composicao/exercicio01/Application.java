package orientacaoobjetos.composicao.exercicio01;

import orientacaoobjetos.composicao.exercicio01.entities.Contrato;
import orientacaoobjetos.composicao.exercicio01.entities.Departamento;
import orientacaoobjetos.composicao.exercicio01.entities.Trabalhador;
import orientacaoobjetos.composicao.exercicio01.enums.NivelTrabalhador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do departamento: ");
        String departamento = scanner.next();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Nivel: ");
        NivelTrabalhador nivelTrabalhador = NivelTrabalhador.valueOf(scanner.next());
        System.out.print("Salario base: ");
        Double salarioBase = scanner.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome, nivelTrabalhador, salarioBase, new Departamento(departamento));
        System.out.print("Quantos contratos para esse trabalhador ?");
        Integer quantidadeContratos = scanner.nextInt();
        for (int i = 1; i <= quantidadeContratos; i++) {
            System.out.println("Entre com os dados do contrato #" + i);
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate data = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Valor por hora: ");
            Double valorPorHora = scanner.nextDouble();
            System.out.print("Duração (Horas): ");
            Integer horas = scanner.nextInt();
            trabalhador.adicionaContrato(new Contrato(data, valorPorHora, horas));
        }
        System.out.print("Digite o mes e o ano para calcular a renda (MM/YYYY): ");
        String mesAno = scanner.next();
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda de " + mesAno + ": " + String.format("%.2f", trabalhador.getRenda(mesAno)));
        scanner.close();
    }

}

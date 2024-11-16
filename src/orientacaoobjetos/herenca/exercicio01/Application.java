package orientacaoobjetos.herenca.exercicio01;

import orientacaoobjetos.herenca.exercicio01.entities.Funcionario;
import orientacaoobjetos.herenca.exercicio01.entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de funcionários: ");
        int n = scanner.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do #"+ i + " funcionário: ");
            System.out.print("Terceirizado (s/n)? ");
            boolean terceirizado = scanner.next().equals("s");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Horas: ");
            Integer horas = scanner.nextInt();
            System.out.print("Valor por hora: ");
            Double valorPorHora = scanner.nextDouble();
            if (terceirizado) {
                System.out.print("Custo adicional: ");
                Double custoAdicional = scanner.nextDouble();
                Funcionario funcionario = new FuncionarioTercerizado(nome, horas, valorPorHora, custoAdicional);
                funcionarios.add(funcionario);
                continue;
            }
            Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
            funcionarios.add(funcionario);
        }
        System.out.println("PAGAMENTOS: ");
        for(Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - $" + String.format("%.2f", funcionario.getPagamento()));
        }
        scanner.close();
    }
}

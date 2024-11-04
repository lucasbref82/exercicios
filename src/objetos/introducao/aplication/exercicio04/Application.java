package objetos.introducao.aplication.exercicio04;

import objetos.introducao.aplication.exercicio04.entities.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Empregado empregado = new Empregado();
        System.out.print("Nome: ");
        empregado.nome = scanner.nextLine();
        System.out.print("Salário Bruto: ");
        empregado.salarioBruto = scanner.nextDouble();
        System.out.print("Desconto: ");
        empregado.desconto = scanner.nextDouble();
        System.out.println("Empregado: " + empregado);
        System.out.print("Deseja aumentar o salário em quantos por cento ? ");
        empregado.acrescentarPorcentagem(scanner.nextDouble());
        System.out.println("Dados atualizados: " + empregado);

        scanner.close();
    }
}

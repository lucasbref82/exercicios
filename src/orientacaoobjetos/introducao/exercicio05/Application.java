package orientacaoobjetos.introducao.exercicio05;

import orientacaoobjetos.introducao.exercicio05.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Entre com o nome e as notas dos trimestes: ");
        estudante.nome = scanner.nextLine();
        estudante.notas.add(scanner.nextDouble());
        estudante.notas.add(scanner.nextDouble());
        estudante.notas.add(scanner.nextDouble());
        if (estudante.calculaTotal() >= 60) {
            System.out.println("NOTA TOTAL = %.2f" + estudante.calculaTotal());
            System.out.println("APROVADO");
        } else {
            System.out.printf("NOTA TOTAL = %.2f%n", estudante.calculaTotal());
            System.out.println("REPROVOU");
            System.out.printf("FALTARAM %.2f PONTOS", estudante.calculaPontosFaltantes());
        }
    }
}

package orientacaoobjetos.abstracao.exercicio01;

import orientacaoobjetos.abstracao.exercicio01.entities.Circulo;
import orientacaoobjetos.abstracao.exercicio01.entities.Forma;
import orientacaoobjetos.abstracao.exercicio01.entities.Retangulo;
import orientacaoobjetos.abstracao.exercicio01.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de formas: ");
        int n = scanner.nextInt();
        List<Forma> formas = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da #" + i + " forma: ");
            System.out.print("Retangulo ou circulo (r/c)? ");
            char tipo = scanner.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(scanner.next());
            if (tipo == 'r') {
                System.out.print("Largura: ");
                Double largura = scanner.nextDouble();
                System.out.print("Altura: ");
                Double altura = scanner.nextDouble();
                formas.add(new Retangulo(cor,largura, altura));
            }
            if (tipo == 'c') {
                System.out.print("Raio: ");
                Double raio = scanner.nextDouble();
                formas.add(new Circulo(cor,raio));
            }
        }
        System.out.println();
        System.out.println("AREA DAS FORMAS: ");
        for (Forma forma : formas) {
            System.out.println(String.format("%.2f", forma.area()));
        }
        scanner.close();
    }
}

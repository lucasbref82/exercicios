package orientacaoobjetos.arranjos.exercicio06;

import orientacaoobjetos.arranjos.exercicio06.service.NumeroService;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar ? ");
        int n = scanner.nextInt();
        double[] valores = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = scanner.nextDouble();
        }
        System.out.println();
        NumeroService numeroService = new NumeroService();
        numeroService.recuperaMaiorValorEPosicao(valores);
        scanner.close();
    }
}

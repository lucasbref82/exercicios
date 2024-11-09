package orientacaoobjetos.arranjos.exercicio05;

import orientacaoobjetos.arranjos.exercicio05.utils.NumerosUtil;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar ? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        NumerosUtil.verificaPares(numeros);
        scanner.close();

    }
}

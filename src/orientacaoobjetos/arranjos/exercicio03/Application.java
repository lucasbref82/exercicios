package orientacaoobjetos.arranjos.exercicio03;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar ? ");
        int quantidadeNumeros = scanner.nextInt();
        int[] numeros = new int[quantidadeNumeros];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.println("NÚMEROS NEGATIVOS: ");

        int[] numerosNegativos = Arrays.stream(numeros).filter(x -> x < 0).toArray();

        for (int i = 0; i < numerosNegativos.length; i++) {
            System.out.println(numerosNegativos[i]);
        }
        scanner.close();
    }
}

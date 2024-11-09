package orientacaoobjetos.arranjos.exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor ?");
        int n = scanner.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = scanner.nextInt();
        }
        System.out.println("Vetor resultante");
        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
        scanner.close();
    }
}

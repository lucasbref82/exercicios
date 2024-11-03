package repetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 */
public class Exercicio06 {

    private static final int PESO_UM = 1;
    private static final int PESO_TRES = 3;
    private static final int PESO_CINCO = 5;
    private static final int DIVISAO_PONDERADA = PESO_UM + PESO_TRES + PESO_CINCO;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int totalItens = sc.nextInt();
        mediaPonderada(totalItens, sc);
        sc.close();
    }

    private static void mediaPonderada(int totalItens, Scanner sc) {

        for (int i = 0; i < totalItens ; i++) {
            double primeiroValor = sc.nextDouble();
            double segundoValor = sc.nextDouble();
            double terceiroValor = sc.nextDouble();

            double media = (primeiroValor * PESO_UM + segundoValor * PESO_TRES + terceiroValor * PESO_CINCO) / DIVISAO_PONDERADA;

            System.out.printf("%.1f%n", media);
        }
    }
}

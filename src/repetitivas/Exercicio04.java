package repetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
 * X, se for o caso.
 */

public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");

        int valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
        sc.close();
    }

}

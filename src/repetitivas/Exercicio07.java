package repetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int percorrido = sc.nextInt();
        for (int i = 0; i < percorrido; i++) {
            int primeiroValor = sc.nextInt();
            int segundoValor = sc.nextInt();
            double valorDivisao = (double) primeiroValor / segundoValor;
            if (segundoValor == 0) {
                System.out.println("Divisão impossível");
            } else {
                System.out.printf("%.1f%n", valorDivisao);
            }
        }
    }
}

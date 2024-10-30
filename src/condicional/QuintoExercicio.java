package condicional;

import java.util.Locale;
import java.util.Scanner;

public class QuintoExercicio {

    // Criaria um enum porém como é básico, solução vai ser básica.
    private static final double CACHORRO_QUENTE = 4.00;
    private static final double X_SALADA = 4.50;
    private static final double X_BACON = 5.00;
    private static final double TORRADA_SIMPLES = 2.00;
    private static final double REFRIGERANTE = 1.50;


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        int produto = sc.nextInt();
        System.out.println("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();
        imprimeValorTotal(produto, quantidade);
        sc.close();
    }

    // Metodo criado para definir a responsabilidade de quem calcula e imprime
    private static void imprimeValorTotal(int produto, int quantidade) {
        if (produto == 1) {
            System.out.printf("Total: R$ %.2f", quantidade * CACHORRO_QUENTE);
        } else if (produto == 2) {
            System.out.printf("Total: R$ %.2f", quantidade * X_SALADA);
        } else if (produto == 3) {
            System.out.printf("Total: R$ %.2f", quantidade * X_BACON);
        }  else if (produto == 4) {
            System.out.printf("Total: R$ %.2f", quantidade * TORRADA_SIMPLES);
        } else if (produto == 5) {
            System.out.printf("Total: R$ %.2f", quantidade * REFRIGERANTE);
        }
    }
}
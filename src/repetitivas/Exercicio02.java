package repetitivas;


import java.util.Scanner;

/**
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */


public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores do plano cartesiano.");

        int primeiroValor = sc.nextInt();
        int segundoValor = sc.nextInt();

        while (primeiroValor != 0 || segundoValor != 0) {
            printaQuadrante(primeiroValor, segundoValor);
            primeiroValor = sc.nextInt();
            segundoValor = sc.nextInt();
        }
        sc.close();
    }

    private static void printaQuadrante(int primeiroValor, int segundoValor) {
        if (primeiroValor > 0 && segundoValor > 0) {
            System.out.println("Primeiro");
        } else if (primeiroValor < 0 && segundoValor > 0) {
            System.out.println("Segundo");
        } else if (primeiroValor < 0 && segundoValor < 0) {
            System.out.println("Terceiro");
        } else if (primeiroValor > 0 && segundoValor < 0) {
            System.out.println("Quarto");
        }
    }
}

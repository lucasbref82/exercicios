package repetitivas;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int aux;
        int in = 0;
        int out = 0;

        for (int i = 0; i < valor; i++) {
            aux = sc.nextInt();
            if (aux >= 10 && aux <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }

}

package repetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

public class Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();

        while(!senha.equals("2002")) {

            System.out.println("Senha inválida !");
            senha = sc.nextLine();

        }

        System.out.println("Acesso permitido !");

    }
}

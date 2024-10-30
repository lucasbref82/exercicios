package condicional;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();
        if (segundoNumero > primeiroNumero) {
            System.out.println(segundoNumero / primeiroNumero == 0 ? "São Multiplos" : "Não são multiplos");
        } else {
            System.out.println(primeiroNumero / segundoNumero == 0 ? "São Multiplos" : "Não são multiplos");
        }
        sc.close();
    }
}
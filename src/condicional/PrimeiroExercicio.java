package condicional;

import java.util.Scanner;

public class PrimeiroExercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println(numero < 0 ? "Negativo" : "Positivo");
        sc.close();
    }

}
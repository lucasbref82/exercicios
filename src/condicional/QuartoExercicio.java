package condicional;

import java.util.Scanner;

public class QuartoExercicio {

    private static final int HORAS_DIA = 24;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();
        if (primeiroNumero == segundoNumero) {
            System.out.println("O JOGOO DUROU 24 HORA(S)");
        } else if (primeiroNumero < segundoNumero) {
            int totalHoras = segundoNumero - primeiroNumero;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
        } else {
            int totalHoras = (segundoNumero + HORAS_DIA) - primeiroNumero;
            System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
        }
        sc.close();
    }
}
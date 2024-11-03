package repetitivas;

import repetitivas.enums.TipoCombustivel;

import java.util.Scanner;


public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4) {
            if (codigo == TipoCombustivel.ALCOOL.getValor()) {
                alcool++;
            } else if (codigo == TipoCombustivel.GASOLINA.getValor()) {
                gasolina++;
            } else if (codigo == TipoCombustivel.DIESEL.getValor()) {
                diesel++;
            }
            codigo = sc.nextInt();
        }

        System.out.println("Muito Obrigado !");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }

}

package orientacaoobjetos.exceptions;

import orientacaoobjetos.exceptions.exceptions.ContaException;
import orientacaoobjetos.exceptions.model.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Número: ");
            Integer numero = scanner.nextInt();
            System.out.print("Titular: ");
            String titular = scanner.next();
            System.out.print("Saldo inicial: ");
            Double saldoInicial = scanner.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteSaque = scanner.nextDouble();
            Conta conta = new Conta(numero, titular, saldoInicial, limiteSaque);
            System.out.println();
            System.out.print("Entre com um valor para saque: ");
            Double valor = scanner.nextDouble();
            conta.saque(valor);
            System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
        } catch (ContaException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

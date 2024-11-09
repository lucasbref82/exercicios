package orientacaoobjetos.encapsulamento.exercicio01;

import orientacaoobjetos.encapsulamento.exercicio01.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Entre com o proprietário da conta: ");
        String proprietarioConta = sc.next();

        System.out.print("Vai haver um deposito inicial (s/n) ? ");
        String ehDepositoInicial = sc.next();
        Conta conta;

        if (ehDepositoInicial.equals("s")) {
            System.out.print("Entre com o valor do deposito: ");
            Double valorDeposito = sc.nextDouble();
            conta = new Conta(numeroConta, proprietarioConta, valorDeposito);
        } else {
            conta = new Conta(numeroConta, proprietarioConta);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Entre com um valor a ser depositado: ");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Entre com um valor a ser sacado: ");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(conta);


    }
}

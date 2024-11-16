package orientacaoobjetos.herenca.exemplo01;

import orientacaoobjetos.herenca.exemplo01.entities.Conta;
import orientacaoobjetos.herenca.exemplo01.entities.ContaEmpresarial;
import orientacaoobjetos.herenca.exemplo01.entities.ContaPoupanca;

import java.util.Locale;

public class Application02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Conta conta1 = new Conta(1001, "Lucas Brenner", 1000.00);
        conta1.saque(200.00);
        System.out.println(conta1.getSaldo());
        Conta conta3 = new ContaEmpresarial(1003, "Debora Cristiane", 1000.00, 150.00);
        System.out.println(conta3.getSaldo());
        Conta conta2 = new ContaPoupanca(1002, "Larissa Eduarda", 1000.00, 0.01);
        conta2.saque(200.00);
        System.out.println(conta2.getSaldo());

    }
}

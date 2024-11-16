package orientacaoobjetos.herenca.exemplo01;

import orientacaoobjetos.herenca.exemplo01.entities.Conta;
import orientacaoobjetos.herenca.exemplo01.entities.ContaEmpresarial;
import orientacaoobjetos.herenca.exemplo01.entities.ContaPoupanca;

import java.util.Locale;

public class Application01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Conta conta = new Conta(1001, "Lucas Brenner", 0.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Larissa", 0.0, 500.0);

        // UPCASTING
        // É possível porque ContaEmpresarial é uma conta.
        Conta conta1 = contaEmpresarial;
        Conta conta2 = new ContaEmpresarial(1003, "Debora", 0.0, 5000.0);
        Conta conta3 = new ContaPoupanca(1004, "Emerson", 0.0, 0.50);

        // DOWNCASTING
        // Não é de maneira natural, temos que ter certeza a variável do tipo Conta é uma ContaEmpresarial
        // Caso não for do tipo irá lançar uma excessão.
        ContaEmpresarial conta4 = (ContaEmpresarial) conta2;
        conta4.solicitarEmprestimo(100.00);

        // Para evitar esse tipo de excessão podemos verificar com o instanceof.
        if (conta3 instanceof ContaEmpresarial) {
            ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
            conta5.solicitarEmprestimo(500.00);
            System.out.println("Emprestimo.");
        }

        if (conta3 instanceof ContaPoupanca) {
            ContaPoupanca conta6 = (ContaPoupanca) conta3;
            conta6.deposito(1500.00);
            System.out.println("Deposito.");
        }



    }

}

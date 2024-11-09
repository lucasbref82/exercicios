package orientacaoobjetos.encapsulamento.exercicio01.entities;

public class Conta {

    private Integer numeroConta;
    private String titular;
    private Double saldo;

    public Conta(Integer numeroConta, String titular, Double valorDepositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        depositar(valorDepositoInicial);
    }

    public Conta(Integer numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    private Conta() {

    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {
        this.saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        this.saldo = saldo - valor - 5;
    }

    @Override
    public String toString() {
        return "Conta : " +
                numeroConta +
                ", Titular : " +
                titular +
                ", Saldo : " +
                String.format("%.2f", saldo);
    }

}

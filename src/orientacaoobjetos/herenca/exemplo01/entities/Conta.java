package orientacaoobjetos.herenca.exemplo01.entities;

public class Conta {

    private Integer numero;
    private String titular;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void deposito(Double valor) {
        saldo += valor;
    }

    public void saque(Double valor) {
        saldo = (saldo - valor) - 5;
    }
}

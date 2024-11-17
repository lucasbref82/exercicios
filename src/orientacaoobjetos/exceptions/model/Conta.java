package orientacaoobjetos.exceptions.model;

import orientacaoobjetos.exceptions.exceptions.ContaException;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        deposito(saldo);
        this.numero = numero;
        this.titular = titular;
        this.limiteSaque = limiteSaque;
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

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double valor) {
        if (this.saldo != null) {
            this.saldo += valor;
        } else {
            this.saldo = valor;
        }
    }

    public void saque(Double valor) {
        validaSaque(valor);
        this.saldo -= valor;
    }

    public void validaSaque(Double valor) {
        if (valor > saldo) {
            throw new ContaException("O valor do saque é maior que o saldo disponível.");
        }
        if (valor > limiteSaque) {
            throw new ContaException("O valor do saque excede o valor limite para saque.");
        }
    }
}

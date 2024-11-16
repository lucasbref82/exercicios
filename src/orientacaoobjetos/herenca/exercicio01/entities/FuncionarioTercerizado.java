package orientacaoobjetos.herenca.exercicio01.entities;

import java.util.Objects;

public class FuncionarioTercerizado extends Funcionario {

    private Double custoAdicional;

    public FuncionarioTercerizado(String nome, Integer hours, Double valorPorHoras, Double custoAdicional) {
        super(nome, hours, valorPorHoras);
        this.custoAdicional = custoAdicional;
    }

    public FuncionarioTercerizado() {

    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public Double getPagamento() {
        return custoAdicional + (custoAdicional * 0.10) + super.getPagamento();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FuncionarioTercerizado that = (FuncionarioTercerizado) o;
        return Objects.equals(custoAdicional, that.custoAdicional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), custoAdicional);
    }
}

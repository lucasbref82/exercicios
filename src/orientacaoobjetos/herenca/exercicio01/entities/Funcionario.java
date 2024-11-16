package orientacaoobjetos.herenca.exercicio01.entities;

import java.util.Objects;

public class Funcionario {

    private String nome;
    protected Integer horas;
    protected Double valorPorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer hours, Double valorPorHoras) {
        this.nome = nome;
        this.horas = hours;
        this.valorPorHora = valorPorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double getPagamento() {
        return horas * valorPorHora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario empregado)) return false;
        return Objects.equals(nome, empregado.nome) && Objects.equals(horas, empregado.horas) && Objects.equals(valorPorHora, empregado.valorPorHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, horas, valorPorHora);
    }
}

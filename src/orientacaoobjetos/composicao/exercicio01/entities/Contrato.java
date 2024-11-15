package orientacaoobjetos.composicao.exercicio01.entities;

import java.time.LocalDate;

public class Contrato {

    private LocalDate data;
    private Double valorPorHora;
    private Integer horas;

    public Contrato(LocalDate date, Double valorPorHora, Integer horas) {
        this.data = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    private Contrato() {

    }

    public LocalDate getData() {
        return data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double valorTotal() {
        return valorPorHora * horas;
    }

}

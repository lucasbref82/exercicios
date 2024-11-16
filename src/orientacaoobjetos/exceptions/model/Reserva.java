package orientacaoobjetos.exceptions.model;

import java.time.LocalDate;

public class Reserva {

    private Integer numeroQuarto;
    private LocalDate chegada;
    private LocalDate saida;

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, LocalDate chegada, LocalDate saida) {
        this.numeroQuarto = numeroQuarto;
        this.chegada = chegada;
        this.saida = saida;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getChegada() {
        return chegada;
    }

    public void setChegada(LocalDate chegada) {
        this.chegada = chegada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

}

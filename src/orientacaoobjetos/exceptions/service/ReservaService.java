package orientacaoobjetos.exceptions.service;

import orientacaoobjetos.exceptions.constantes.Constantes;
import orientacaoobjetos.exceptions.exceptions.ObjetoNuloException;
import orientacaoobjetos.exceptions.exceptions.ReservaException;
import orientacaoobjetos.exceptions.model.Reserva;
import orientacaoobjetos.utilitarios.ExercicioUtils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReservaService {

    public Integer duracaoEmDias(Reserva reserva) throws ObjetoNuloException, ReservaException {
        validaReserva(reserva);
        return (int) ChronoUnit.DAYS.between(reserva.getChegada(), reserva.getSaida());
    }

    public void atualizaDatas(Reserva reserva, LocalDate chegada, LocalDate saida) throws ObjetoNuloException, ReservaException {
        validaReserva(reserva);
        validaReserva(chegada, saida);
        reserva.setChegada(chegada);
        reserva.setSaida(saida);
    }

    public void imprimeReserva(Reserva reserva) throws ObjetoNuloException, ReservaException {
        StringBuilder dadosReserva = new StringBuilder();
        dadosReserva.append("Quarto: ")
                .append(reserva.getNumeroQuarto())
                .append(", chegada: ")
                .append(ExercicioUtils.PADRAO_DATA_BRASIL.format(reserva.getChegada()))
                .append(", saída: ")
                .append(ExercicioUtils.PADRAO_DATA_BRASIL.format(reserva.getSaida()))
                .append(", ")
                .append(duracaoEmDias(reserva))
                .append(" noites.");
        System.out.println(dadosReserva);
    }

    public void validaReserva(Reserva reserva) throws ReservaException, ObjetoNuloException {
        if (ExercicioUtils.nullabeObject(reserva)) {
            throw new ObjetoNuloException("Uma reserva não pode ser nula !");
        }
        if (reserva.getChegada() != null && reserva.getChegada().isBefore(LocalDate.now())) {
            throw new ReservaException(Constantes.DATA_CHEGADA_MENOR_DATA_ATUAL);
        }
        if (reserva.getSaida() != null && reserva.getSaida().isBefore(LocalDate.now())) {
            throw new ReservaException(Constantes.DATA_SAIDA_MENOR_DATA_ATUAL);
        }
        if (reserva.getSaida().isBefore(reserva.getChegada())) {
            throw new ReservaException(Constantes.DATA_SAIDA_MENOR_CHEGADA);
        }
    }

    public void validaReserva(LocalDate chegada, LocalDate saida) throws ReservaException {
        if (saida.isBefore(chegada)) {
            throw new ReservaException(Constantes.DATA_SAIDA_MENOR_CHEGADA);
        }
        if (chegada.isBefore(LocalDate.now())) {
            throw new ReservaException(Constantes.DATA_CHEGADA_MENOR_DATA_ATUAL);
        }
        if (saida.isBefore(LocalDate.now())) {
            throw new ReservaException(Constantes.DATA_SAIDA_MENOR_DATA_ATUAL);
        }
    }
}

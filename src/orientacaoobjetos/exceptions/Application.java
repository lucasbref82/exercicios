package orientacaoobjetos.exceptions;

import orientacaoobjetos.exceptions.exceptions.ObjetoNuloException;
import orientacaoobjetos.exceptions.exceptions.ReservaException;
import orientacaoobjetos.exceptions.model.Reserva;
import orientacaoobjetos.exceptions.service.ReservaService;
import orientacaoobjetos.utilitarios.ExercicioUtils;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número do quarto: ");
        Integer numeroQuarto = scanner.nextInt();
        System.out.print("Data de chegada (DD/MM/YYYY): ");
        LocalDate chegada = LocalDate.parse(scanner.next(), ExercicioUtils.PADRAO_DATA_BRASIL);
        System.out.print("Data de saída (DD/MM/YYYY): ");
        LocalDate saida = LocalDate.parse(scanner.next(), ExercicioUtils.PADRAO_DATA_BRASIL);
        Reserva reserva = new Reserva(numeroQuarto, chegada, saida);
        ReservaService reservaService = new ReservaService();
        try {
            reservaService.imprimeReserva(reserva);
        } catch (ObjetoNuloException | ReservaException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            scanner.close();
            // Encerra o programa com o status 1 (Erro)
            System.exit(1);
        }
        System.out.println();
        System.out.println("Digite os dados para atualização da reserva");
        System.out.print("Data de chegada: ");
        chegada = LocalDate.parse(scanner.next(), ExercicioUtils.PADRAO_DATA_BRASIL);
        System.out.print("Data de saída: ");
        saida = LocalDate.parse(scanner.next(), ExercicioUtils.PADRAO_DATA_BRASIL);
        try {
            reservaService.atualizaDatas(reserva, chegada, saida);
            reservaService.imprimeReserva(reserva);
        } catch (ObjetoNuloException | ReservaException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            scanner.close();
            System.exit(1);
        }
    }
}

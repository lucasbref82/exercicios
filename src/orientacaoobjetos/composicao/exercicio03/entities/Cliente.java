package orientacaoobjetos.composicao.exercicio03.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private final DateTimeFormatter padraoAniversario = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private String email;
    private LocalDate dataAniversario;

    public Cliente(String nome, String email, LocalDate dataAniversario) {
        this.nome = nome;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public Cliente() {
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + padraoAniversario.format(dataAniversario) + ") - " + email + "\n";
    }
}

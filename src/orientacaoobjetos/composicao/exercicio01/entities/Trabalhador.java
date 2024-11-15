package orientacaoobjetos.composicao.exercicio01.entities;

import orientacaoobjetos.composicao.exercicio01.enums.NivelTrabalhador;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelTrabalhador nivelTrabalhador;
    private Double salarioBase;
    private List<Contrato> contratos;
    private Departamento departamento;

    public Trabalhador(String nome, NivelTrabalhador nivelTrabalhador, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivelTrabalhador = nivelTrabalhador;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.contratos = new ArrayList<>();
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public NivelTrabalhador getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratos.remove(contrato);
    }

    public Double getRenda(String mesAno) {
        return salarioBase + contratos.stream()
                .filter(contrato -> mesAno.equals(DateTimeFormatter.ofPattern("MM/yyyy").format(contrato.getData())))
                .mapToDouble(Contrato::valorTotal)
                .sum();
    }
}

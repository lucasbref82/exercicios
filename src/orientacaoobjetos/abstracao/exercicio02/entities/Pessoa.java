package orientacaoobjetos.abstracao.exercicio02.entities;

public abstract class Pessoa {
    protected String nome;
    protected Double rendaAnual;

    protected Pessoa() {
    }

    protected Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double calculoImposto();
}

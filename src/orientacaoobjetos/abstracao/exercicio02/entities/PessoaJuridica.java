package orientacaoobjetos.abstracao.exercicio02.entities;

public class PessoaJuridica extends Pessoa{

    private Integer quantidadeFuncionarios;

    public PessoaJuridica() {
        super();
    }
    public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public Double calculoImposto() {
        return quantidadeFuncionarios > 10 ? rendaAnual * 0.14 : rendaAnual * 0.16;
    }
}

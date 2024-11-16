package orientacaoobjetos.abstracao.exercicio02.entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calculoImposto() {
        Double porcentagem = rendaAnual < 20000.00 ? 0.15 : 0.25;
        return gastosSaude > 0
                    ? (rendaAnual * porcentagem) - (gastosSaude * 0.50)
                    : rendaAnual * porcentagem;
    }
}

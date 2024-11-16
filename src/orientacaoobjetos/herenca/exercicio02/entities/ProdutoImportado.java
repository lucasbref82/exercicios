package orientacaoobjetos.herenca.exercicio02.entities;

public final class ProdutoImportado extends Produto {

    private Double taxaImportacao;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String etiquetaPreco() {
        return nome + " $ " + String.format("%.2f", precoTotal()) + " (Taxa importacao: $ " + String.format("%.2f)", taxaImportacao);
    }

    public Double precoTotal() {
        return preco + taxaImportacao;
    }
}

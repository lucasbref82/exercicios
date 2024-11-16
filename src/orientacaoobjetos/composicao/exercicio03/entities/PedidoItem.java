package orientacaoobjetos.composicao.exercicio03.entities;

public class PedidoItem {

    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public PedidoItem() {
    }

    public PedidoItem(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = produto.getPreco();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return produto.getNome() +
                ", " + "$" +
                String.format("%.2f", preco) + ", " +
                "Quantidade: " +
                quantidade +
                ", Subtotal: " +
                "$" +
                String.format("%.2f", subTotal()) + "\n";
    }
}

package objetos.introducao.aplication.exercicio02.entities;

public class Produto {

    public String nome;
    public Double valor;
    public Integer estoque;

    public Double calculaTotal() {
        return estoque * valor;
    }

    public void adicionarEstoque(Integer estoque) {
        this.estoque += estoque;
    }

    public void removerEstoque(Integer estoque) {
        this.estoque -= estoque;
    }

    @Override
    public String toString() {
        return "Dados do produto: " + this.nome + ", $ "+ String.format("%.2f", this.valor) + ", " + this.estoque + " unidades, Total: $ " + String.format("%.2f", calculaTotal());
    }
}

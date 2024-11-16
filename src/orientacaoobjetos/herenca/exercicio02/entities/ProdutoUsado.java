package orientacaoobjetos.herenca.exercicio02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ProdutoUsado extends Produto {

    private LocalDate dataFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        return nome + " (usado) $ " + String.format("%.2f", preco) + " (Data de fabricação: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataFabricacao) + ")";
    }
}

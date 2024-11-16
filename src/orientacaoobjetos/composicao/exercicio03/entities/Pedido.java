package orientacaoobjetos.composicao.exercicio03.entities;

import orientacaoobjetos.composicao.exercicio03.enums.StatusPedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataCriacao;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private List<PedidoItem> pedidoItens = new ArrayList<>();

    public Pedido(LocalDate dataCriacao, StatusPedido statusPedido, Cliente cliente) {
        this.dataCriacao = dataCriacao;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public Pedido() {
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItem> getPedidoItens() {
        return pedidoItens;
    }

    public void adicionaItem(PedidoItem pedidoItem) {
        pedidoItens.add(pedidoItem);
    }

    public void removeItem(PedidoItem pedidoItem) {
        pedidoItens.remove(pedidoItem);
    }

    public Double totalPedido() {
        return pedidoItens.stream().mapToDouble(PedidoItem::subTotal).sum();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data de criação: ").append(padraoData.format(dataCriacao)).append("\n");
        stringBuilder.append("Status pedido: ").append(statusPedido.getDescricao()).append("\n");
        stringBuilder.append(cliente);
        stringBuilder.append("Itens do pedido").append("\n");
        for (PedidoItem pedidoItem : pedidoItens) {
            stringBuilder.append(pedidoItem.toString());
        }
        stringBuilder.append("Preço total: $").append(String.format("%.2f", totalPedido()));
        return stringBuilder.toString();
    }
}

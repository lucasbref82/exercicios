package orientacaoobjetos.composicao.exercicio03.enums;

public enum StatusPedido {

    PENDENTE_PAGAMENTO("Pendente de pagamento"),
    PROCESSANDO("Processando"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue");

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }
}

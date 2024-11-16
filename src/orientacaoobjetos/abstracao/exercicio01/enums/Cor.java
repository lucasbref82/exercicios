package orientacaoobjetos.abstracao.exercicio01.enums;

public enum Cor {
    PRETO("Preto"),
    AZUL("Azul"),
    VERMELHO("Vermelho");

    Cor(String valor) {
        this.valor = valor;
    }

    private String valor;

    public String getValor() {
        return valor;
    }
}

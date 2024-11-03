package repetitivas.enums;


public enum TipoCombustivel {

    ALCOOL(1),
    GASOLINA(2),
    DIESEL(3);

    private final Integer valor;


    public Integer getValor() {
        return valor;
    }

    TipoCombustivel(Integer valor) {
        this.valor = valor;
    }
}

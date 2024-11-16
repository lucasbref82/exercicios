package orientacaoobjetos.abstracao.exercicio01.entities;

import orientacaoobjetos.abstracao.exercicio01.enums.Cor;

public abstract class Forma {

    private Cor cor;

    protected Forma() {
    }

    protected Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract Double area();
}

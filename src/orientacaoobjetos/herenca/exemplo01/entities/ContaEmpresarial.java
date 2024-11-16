package orientacaoobjetos.herenca.exemplo01.entities;

public final class ContaEmpresarial extends Conta{

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void solicitarEmprestimo(Double valor) {
        if (valor <= limiteEmprestimo) saldo += valor;
    }

    @Override
    public final void saque(Double valor) {
        saldo -= valor;
    }
}

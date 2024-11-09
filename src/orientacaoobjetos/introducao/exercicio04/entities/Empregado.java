package orientacaoobjetos.introducao.exercicio04.entities;

public class Empregado {
    public String nome;
    public Double salarioBruto;
    public Double desconto;

    public Double salarioTotal() {
        return salarioBruto - desconto;
    }

    public void acrescentarPorcentagem(Double porcentagem) {
        this.salarioBruto += (this.salarioBruto * porcentagem) / 100;
    }

    @Override
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioTotal());
    }
}

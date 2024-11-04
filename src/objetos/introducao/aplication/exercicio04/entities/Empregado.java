package objetos.introducao.aplication.exercicio04.entities;

import java.lang.invoke.StringConcatFactory;

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

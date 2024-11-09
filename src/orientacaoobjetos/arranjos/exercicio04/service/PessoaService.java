package orientacaoobjetos.arranjos.exercicio04.service;

import orientacaoobjetos.arranjos.exercicio04.entities.Pessoa;

import java.util.Arrays;

public class PessoaService {

    public double calculaMediaAltura(Pessoa[] pessoas) {
        double somaAlturas = Arrays.stream(pessoas)
                .map(Pessoa::getAltura)
                .mapToDouble(aDouble -> aDouble)
                .sum();
        return somaAlturas / pessoas.length;
    }

    public double calculaPorcentagem(Pessoa[] pessoas) {
        int quantidadeMenor = (int) Arrays.stream(pessoas)
                .map(Pessoa::getIdade)
                .filter(idade -> idade < 16)
                .count();

        return (double) quantidadeMenor / pessoas.length * 100;
    }

    public void imprimirPessoasMenores16(Pessoa[] pessoas) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
    }
}

package orientacaoobjetos.arranjos.exercicio06.service;

public class NumeroService {

    public void recuperaMaiorValorEPosicao(double[] valores) {
        double maiorValor = 0;
        int posicaoMaiorValor = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.println("MAIOR VALOR: " + String.format("%.2f", maiorValor));
        System.out.println("POSICAO DO MAIOR VALOR: " + posicaoMaiorValor);
    }
}

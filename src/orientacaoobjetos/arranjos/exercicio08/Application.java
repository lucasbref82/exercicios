package orientacaoobjetos.arranjos.exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos elementos vai ser o vetor: ");
        int n = scanner.nextInt();
        double[] valores = new double[n];
        double media = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número : ");
            valores[i] = scanner.nextDouble();
            media += valores[i];
        }
        double mediaCalculada =  calculaMedia(media, valores.length);
        System.out.println("MEDIA DO VETOR = " + String.format("%.3f",mediaCalculada));
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < mediaCalculada) {
                System.out.println(String.format("%.2f", valores[i]));
            }
        }
        scanner.close();
    }

    private static double calculaMedia(double media, int quantidadeDeItens) {
        return media / quantidadeDeItens;
    }
}

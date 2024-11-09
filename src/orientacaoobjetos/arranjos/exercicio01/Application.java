package orientacaoobjetos.arranjos.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alturas a serem lidas: ");
        int quantidadeAlturas = scanner.nextInt();
        double[] totalAlturas = new double[quantidadeAlturas];
        for(int i = 0; i < quantidadeAlturas; i++) {
            totalAlturas[i] = scanner.nextDouble();
        }
        double somaAltura = 0;
        for (Double valor : totalAlturas) {
            somaAltura += valor;
        }
        System.out.println();
        System.out.println("MÉDIA DAS ALTURAS: " + String.format("%.2f", somaAltura / totalAlturas.length));
    }
}

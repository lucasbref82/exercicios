package objetos.introducao.aplication.exercicio03;

import objetos.introducao.aplication.exercicio03.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Entre com a largura e a altura do retângulo: ");
        retangulo.largura = scanner.nextDouble();
        retangulo.altura = scanner.nextDouble();
        System.out.printf("ÁREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        scanner.close();
    }
}

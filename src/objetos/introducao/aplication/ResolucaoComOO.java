package objetos.introducao.aplication;

import objetos.introducao.aplication.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class ResolucaoComOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as medidas do primeiro triângulo: ");
        Triangulo x = new Triangulo();
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do segundo triângulo: ");
        Triangulo y = new Triangulo();
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("Área do triangulo x : %.4f%n", x.area());
        System.out.printf("Área do triangulo y : %.4f%n", y.area());

        System.out.println(x.area() > y.area() ? "Maior área X." : "Maior área Y.");
        sc.close();
    }
}

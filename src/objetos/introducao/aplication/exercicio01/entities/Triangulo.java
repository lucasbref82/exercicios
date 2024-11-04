package objetos.introducao.aplication.exercicio01.entities;

public class Triangulo {
    public static double a;
    public static double b;
    public static double c;

    private static double calculaP() {
        return (a + b + c) / 2;
    }

    public static double area() {
        var valorP = calculaP();
        return Math.sqrt(valorP * (valorP - a) * (valorP - b) * (valorP - c));
    }
}

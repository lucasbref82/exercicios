package orientacaoobjetos.introducao.exercicio03.entities;

public class Retangulo {
    public Double largura;
    public Double altura;

    public Double area() {
        return largura * altura;
    }

    public Double perimetro() {
        return 2 * (largura + altura);
    }

    public Double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}

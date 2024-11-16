package orientacaoobjetos.abstracao.exercicio01.entities;

import orientacaoobjetos.abstracao.exercicio01.enums.Cor;

public class Circulo extends Forma{

    private Double raio;

    public Circulo() {
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * (Math.pow(raio, 2));
    }
}
